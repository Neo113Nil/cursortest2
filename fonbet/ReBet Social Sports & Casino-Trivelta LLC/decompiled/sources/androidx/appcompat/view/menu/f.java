package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: a, reason: collision with root package name */
    public e f16726a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.a f16727b;

    /* renamed from: c, reason: collision with root package name */
    public c f16728c;

    /* renamed from: d, reason: collision with root package name */
    public i.a f16729d;

    public f(e eVar) {
        this.f16726a = eVar;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void a(e eVar, boolean z10) {
        if (z10 || eVar == this.f16726a) {
            c();
        }
        i.a aVar = this.f16729d;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean b(e eVar) {
        i.a aVar = this.f16729d;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.a aVar = this.f16727b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f16726a;
        a.C0340a c0340a = new a.C0340a(eVar.w());
        c cVar = new c(c0340a.getContext(), l.g.f55131j);
        this.f16728c = cVar;
        cVar.c(this);
        this.f16726a.b(this.f16728c);
        c0340a.a(this.f16728c.k(), this);
        View A10 = eVar.A();
        if (A10 != null) {
            c0340a.c(A10);
        } else {
            c0340a.d(eVar.y()).setTitle(eVar.z());
        }
        c0340a.l(this);
        androidx.appcompat.app.a create = c0340a.create();
        this.f16727b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f16727b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= PKIFailureInfo.unsupportedVersion;
        this.f16727b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f16726a.O((g) this.f16728c.k().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f16728c.a(this.f16726a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f16727b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f16727b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f16726a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f16726a.performShortcut(i10, keyEvent, 0);
    }
}
