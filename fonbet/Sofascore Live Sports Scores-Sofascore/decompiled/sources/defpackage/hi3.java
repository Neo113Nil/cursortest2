package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.Internal;
import com.sofascore.results.dialog.SettingsBottomSheetModal;
import com.sofascore.results.settings.PreferenceFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi3 implements Continuation, OnFailureListener, bt8, k4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hi3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        tw9 tw9Var = (tw9) this.b;
        String str = (String) this.c;
        pw9 pw9Var = (pw9) this.d;
        qw9 qw9Var = (qw9) this.e;
        sw9 sw9Var = (sw9) this.f;
        tw9Var.getClass();
        Internal.ProtobufList j = ((wy7) obj).j();
        int i = ob8.a;
        rha.x(j, "source is null");
        int i2 = 2;
        ub8 ub8Var = new ub8(new dc8(new ub8(new ub8(new zb8(j, i2), new pw9(tw9Var, i2), i2), new k09(str), i2).b(pw9Var).b(qw9Var).b(sw9Var), 1), new hpo(new m39(2)), 4);
        int i3 = ob8.a;
        rha.E(i3, "bufferSize");
        return new p0c(new fc8(new lc8(ub8Var, i3, 1)), new qw9(tw9Var, str, 0), 0);
    }

    @Override // defpackage.k4f
    public void m(Preference preference) {
        PreferenceFragment preferenceFragment = (PreferenceFragment) this.b;
        String str = (String) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        String str2 = (String) this.e;
        Preference preference2 = (Preference) this.f;
        FragmentActivity requireActivity = preferenceFragment.requireActivity();
        requireActivity.getClass();
        ord ordVar = new ord(26, preferenceFragment, preference2);
        str.getClass();
        SettingsBottomSheetModal settingsBottomSheetModal = new SettingsBottomSheetModal();
        Bundle bundle = new Bundle();
        bundle.putString("MODAL_TITLE", str);
        bundle.putString("MODAL_PREFERENCE_KEY", "PREF_LANGUAGE_CODE");
        bundle.putString("MODAL_DEFAULT_VALUE", "");
        bundle.putParcelableArrayList("MODAL_ITEM_LIST", new ArrayList<>(arrayList));
        bundle.putString("MODAL_SELECTED_ITEM", str2);
        settingsBottomSheetModal.setArguments(bundle);
        settingsBottomSheetModal.C = ordVar;
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(settingsBottomSheetModal, appCompatActivity, rq3Var, 3));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6((CredentialProviderPlayServicesImpl) obj5, (gw2) obj4, (CancellationSignal) obj3, (Executor) obj2, (oy3) obj, exc);
                break;
            default:
                fx8 fx8Var = (fx8) obj5;
                Context context = ((cx8) obj4).f;
                oy3 oy3Var = (oy3) obj3;
                Executor executor = (Executor) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                exc.getClass();
                CredentialProviderPlayServicesImpl.Companion.getClass();
                fx8Var.getClass();
                Iterator it = fx8Var.a.iterator();
                while (it.hasNext()) {
                    if (((ix8) it.next()) instanceof px8) {
                        new yy3(context).g(fx8Var, cancellationSignal, executor, oy3Var);
                        break;
                    }
                }
                new ty3(context).f(fx8Var, cancellationSignal, executor, oy3Var);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ji3 ji3Var = (ji3) this.b;
        Task task2 = (Task) this.c;
        Task task3 = (Task) this.d;
        Date date = (Date) this.e;
        HashMap hashMap = (HashMap) this.f;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new f58("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new f58("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            ii3 c = ji3Var.c((String) task2.getResult(), ((mu0) task3.getResult()).a, date, hashMap);
            return c.a != 0 ? Tasks.forResult(c) : ((di3) ji3Var.f).d(c.b).onSuccessTask((Executor) ji3Var.c, new l1(c, 14));
        } catch (g58 e) {
            return Tasks.forException(e);
        }
    }
}
