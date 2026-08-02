package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p84 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p84(kmi kmiVar) {
        super(new Handler());
        this.b = kmiVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                kmi kmiVar = (kmi) this.b;
                if (kmiVar.b && (cursor = kmiVar.c) != null && !cursor.isClosed()) {
                    kmiVar.a = kmiVar.c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p84(g62 g62Var, Handler handler) {
        super(handler);
        this.b = g62Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((g62) this.b).d(Unit.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
