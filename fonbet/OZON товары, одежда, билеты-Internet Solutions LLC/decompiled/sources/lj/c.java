package lj;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.f;
import androidx.appcompat.app.g;
import androidx.fragment.app.r;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6762h;
import hj.C6960a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<String> f73375c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f73376d = 0;

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6592d<String[]> f73377a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7737t f73378b;

    public static final class a {
        @NotNull
        public static Set a() {
            return c.f73375c;
        }
    }

    static final class b extends AbstractC7737t implements Function2<Boolean, Boolean, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f73379b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            bool2.booleanValue();
            return Unit.f71690a;
        }
    }

    /* renamed from: lj.c$c, reason: collision with other inner class name */
    static final class C1244c extends AbstractC7737t implements Function2<Boolean, Boolean, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1244c f73380b = new C1244c(2);

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            bool2.booleanValue();
            return Unit.f71690a;
        }
    }

    static {
        String[] elements = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f73375c = C7705l.j0(elements);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    public static void a(c cVar, final g gVar, Map grantedMap) {
        Intrinsics.checkNotNullParameter(grantedMap, "grantedMap");
        int i11 = C8938a.f81237c;
        C8938a.b("requestPermissionLauncher was called");
        Collection values = grantedMap.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    Set<String> set = f73375c;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (androidx.core.app.b.h(gVar, (String) it2.next())) {
                                cVar.getClass();
                                int i12 = C8938a.f81237c;
                                C8938a.b("Show request permission rationale dialog");
                                f.a aVar = new f.a(gVar, R.style.Theme_AppCompat_DayNight_Dialog_Alert);
                                aVar.p(R.string.in_app_update_rationale_dialog_title);
                                aVar.e(R.string.in_app_update_rationale_dialog_message);
                                aVar.setPositiveButton(R.string.in_app_update_rationale_dialog_permission_settings_button_text, new DialogInterface.OnClickListener() { // from class: lj.b
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        g gVar2 = g.this;
                                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", gVar2.getPackageName(), null));
                                        intent.addFlags(268435456);
                                        gVar2.startActivity(intent);
                                    }
                                }).setNegativeButton(R.string.in_app_update_rationale_dialog_cancel_button_text, null).q();
                                ?? r22 = cVar.f73378b;
                                if (r22 != 0) {
                                    r22.invoke(Boolean.FALSE, Boolean.TRUE);
                                }
                                cVar.f73378b = d.f73381b;
                                C6960a.e();
                            }
                        }
                    }
                    int i13 = C8938a.f81237c;
                    C8938a.b("Request for permission has been denied");
                    ?? r23 = cVar.f73378b;
                    if (r23 != 0) {
                        r23.invoke(Boolean.FALSE, Boolean.TRUE);
                    }
                    cVar.f73378b = d.f73381b;
                    C6960a.e();
                }
            }
        }
        int i14 = C8938a.f81237c;
        C8938a.b("All permission granted");
        ?? r24 = cVar.f73378b;
        if (r24 != 0) {
            Boolean bool = Boolean.TRUE;
            r24.invoke(bool, bool);
        }
        cVar.f73378b = d.f73381b;
        C6960a.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull final g activity, @NotNull Function2 onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f73378b = (AbstractC7737t) onResult;
        this.f73377a = activity.registerForActivityResult(new C6762h(), new InterfaceC6590b() { // from class: lj.a
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                c.a(c.this, activity, (Map) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    public final void d(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i11 = C8938a.f81237c;
        C8938a.b("Request permissions to download apk");
        if (Build.VERSION.SDK_INT >= 30) {
            ?? r62 = this.f73378b;
            if (r62 != 0) {
                r62.invoke(Boolean.TRUE, Boolean.FALSE);
            }
            this.f73378b = b.f73379b;
            C6960a.e();
            return;
        }
        Set<String> set = f73375c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (androidx.core.content.a.checkSelfPermission(activity, (String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        int i12 = C8938a.f81237c;
        C8938a.b("Request external storage permissions: " + set);
        AbstractC6592d<String[]> abstractC6592d = this.f73377a;
        if (abstractC6592d != null) {
            abstractC6592d.a(strArr);
        }
    }

    public final void e() {
        int i11 = C8938a.f81237c;
        C8938a.b("Unregister requestPermissionLauncher");
        AbstractC6592d<String[]> abstractC6592d = this.f73377a;
        if (abstractC6592d != null) {
            abstractC6592d.b();
        }
        this.f73378b = C1244c.f73380b;
    }
}
