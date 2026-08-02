package eg;

import android.content.DialogInterface;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.settings.SettingFragment;
import eg.r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 extends FunctionReferenceImpl implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i5, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i5, obj, cls, str, str2, i10);
        this.f9178a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final int i5 = 2;
        Continuation continuation = null;
        switch (this.f9178a) {
            case 0:
                ((i1) this.receiver).l((Throwable) obj);
                return Unit.f19194a;
            case 1:
                Set invalidatedTablesIds = (Set) obj;
                Intrinsics.checkNotNullParameter(invalidatedTablesIds, "p0");
                k2.i iVar = (k2.i) this.receiver;
                ReentrantLock reentrantLock = iVar.f18679d;
                reentrantLock.lock();
                try {
                    List W = CollectionsKt.W(iVar.f18678c.values());
                    reentrantLock.unlock();
                    Iterator it = W.iterator();
                    if (!it.hasNext()) {
                        return Unit.f19194a;
                    }
                    ((k2.o) it.next()).getClass();
                    Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
                    throw null;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            case 2:
                final q p02 = (q) obj;
                Intrinsics.checkNotNullParameter(p02, "p0");
                SettingFragment settingFragment = (SettingFragment) this.receiver;
                String string = settingFragment.getResources().getString(R.string.no);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = settingFragment.getResources().getString(R.string.yes);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = settingFragment.getResources().getString(R.string.cancel);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                final int i10 = 0;
                final int i11 = 1;
                new MaterialAlertDialogBuilder(settingFragment.requireContext(), R.style.MaterialAlertDialogSettings).setTitle((CharSequence) settingFragment.getResources().getString(R.string.logout_from_account)).setMessage((CharSequence) settingFragment.getResources().getString(R.string.logout_ask)).setPositiveButton((CharSequence) string, new DialogInterface.OnClickListener() { // from class: ne.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        switch (i10) {
                            case 0:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                        }
                    }
                }).setNegativeButton((CharSequence) string2, new DialogInterface.OnClickListener() { // from class: ne.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        switch (i11) {
                            case 0:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                        }
                    }
                }).setNeutralButton((CharSequence) string3, new DialogInterface.OnClickListener() { // from class: ne.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                                dialogInterface.dismiss();
                                ((r) p02).Q(Integer.valueOf(i12));
                                break;
                        }
                    }
                }).show();
                return Unit.f19194a;
            case 3:
                int intValue = ((Number) obj).intValue();
                MainActivity mainActivity = (MainActivity) this.receiver;
                Set set = MainActivity.J0;
                mainActivity.getClass();
                androidx.lifecycle.z g10 = androidx.lifecycle.d1.g(mainActivity);
                lg.e eVar = m0.f9201a;
                c0.t(g10, jg.q.f18523a, null, new cd.k(intValue, 12, mainActivity, continuation), 2);
                return Unit.f19194a;
            default:
                ((pd.t) this.receiver).getClass();
                return c0.i(new bd.b(i5, continuation, 18), (Continuation) obj);
        }
    }
}
