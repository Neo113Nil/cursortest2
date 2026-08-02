package za;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C2035b;
import androidx.annotation.NonNull;
import java.util.Objects;
import kotlin.time.DurationKt;

/* renamed from: za.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6952c {

    /* renamed from: a, reason: collision with root package name */
    public final d f68646a = a();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6951b f68647b;

    /* renamed from: c, reason: collision with root package name */
    public final View f68648c;

    /* renamed from: za.c$b */
    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f68649a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r3 = r3.findOnBackInvokedDispatcher();
         */
        @Override // za.C6952c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(@NonNull InterfaceC6951b interfaceC6951b, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.f68649a == null && findOnBackInvokedDispatcher != null) {
                OnBackInvokedCallback c10 = c(interfaceC6951b);
                this.f68649a = c10;
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? DurationKt.NANOS_IN_MILLIS : 0, c10);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r2 = r2.findOnBackInvokedDispatcher();
         */
        @Override // za.C6952c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void b(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.f68649a == null || findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f68649a);
            this.f68649a = null;
        }

        public OnBackInvokedCallback c(final InterfaceC6951b interfaceC6951b) {
            Objects.requireNonNull(interfaceC6951b);
            return new OnBackInvokedCallback() { // from class: za.e
                public final void onBackInvoked() {
                    InterfaceC6951b.this.d();
                }
            };
        }

        public boolean d() {
            return this.f68649a != null;
        }
    }

    /* renamed from: za.c$c, reason: collision with other inner class name */
    public static class C0982c extends b {

        /* renamed from: za.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6951b f68650a;

            public a(InterfaceC6951b interfaceC6951b) {
                this.f68650a = interfaceC6951b;
            }

            public void onBackCancelled() {
                if (C0982c.this.d()) {
                    this.f68650a.a();
                }
            }

            public void onBackInvoked() {
                this.f68650a.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0982c.this.d()) {
                    this.f68650a.c(new C2035b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0982c.this.d()) {
                    this.f68650a.b(new C2035b(backEvent));
                }
            }
        }

        public C0982c() {
            super();
        }

        @Override // za.C6952c.b
        public OnBackInvokedCallback c(InterfaceC6951b interfaceC6951b) {
            return new a(interfaceC6951b);
        }
    }

    /* renamed from: za.c$d */
    public interface d {
        void a(InterfaceC6951b interfaceC6951b, View view, boolean z10);

        void b(View view);
    }

    public C6952c(InterfaceC6951b interfaceC6951b, View view) {
        this.f68647b = interfaceC6951b;
        this.f68648c = view;
    }

    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0982c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    public void b() {
        c(false);
    }

    public final void c(boolean z10) {
        d dVar = this.f68646a;
        if (dVar != null) {
            dVar.a(this.f68647b, this.f68648c, z10);
        }
    }

    public void d() {
        d dVar = this.f68646a;
        if (dVar != null) {
            dVar.b(this.f68648c);
        }
    }
}
