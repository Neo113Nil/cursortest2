package k5;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import k5.InterfaceC7518g2;

/* renamed from: k5.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7568t1 extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC7572u1 f70867a;

    C7568t1(AbstractC7572u1 abstractC7572u1) {
        this.f70867a = abstractC7572u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Mm0.e eVar, AppSetIdInfo appSetIdInfo) {
        int i11;
        String str;
        int i12;
        String str2;
        int scope = appSetIdInfo.getScope();
        AbstractC7572u1 abstractC7572u1 = this.f70867a;
        abstractC7572u1.f70872h = scope;
        abstractC7572u1.f70871g = appSetIdInfo.getId();
        if (eVar == Mm0.e.AppSetIdScopeApp) {
            i12 = abstractC7572u1.f70872h;
            if (i12 == 1) {
                str2 = abstractC7572u1.f70871g;
                abstractC7572u1.a(str2);
                return;
            }
        }
        if (eVar == Mm0.e.AppSetIdScopeDeveloper) {
            i11 = abstractC7572u1.f70872h;
            if (i11 == 2) {
                str = abstractC7572u1.f70871g;
                abstractC7572u1.a(str);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        AbstractC7572u1 abstractC7572u1 = this.f70867a;
        final Mm0.e x11 = abstractC7572u1.x();
        if (abstractC7572u1.p(InterfaceC7500c0.f70717a) != 0) {
            return;
        }
        context = abstractC7572u1.f70869e;
        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: k5.s1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C7568t1.this.b(x11, (AppSetIdInfo) obj);
            }
        });
    }
}
