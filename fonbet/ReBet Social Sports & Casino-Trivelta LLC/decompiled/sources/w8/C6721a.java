package w8;

import T7.AbstractC1671k;
import T7.B;
import T7.C1661a;
import T7.C1665e;
import T7.C1670j;
import T7.InterfaceC1668h;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import g6.InterfaceC4354n;
import h6.C4470F;
import java.util.ArrayList;
import java.util.List;
import v8.C6655d;
import v8.C6657f;
import v8.C6659h;
import v8.C6663l;
import v8.EnumC6656e;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6721a extends C6725e {

    /* renamed from: o, reason: collision with root package name */
    public static final int f67497o = C1665e.c.Message.b();

    /* renamed from: n, reason: collision with root package name */
    public boolean f67498n;

    /* renamed from: w8.a$b */
    public class b extends AbstractC1671k.b {

        /* renamed from: w8.a$b$a, reason: collision with other inner class name */
        public class C0956a implements C1670j.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1661a f67500a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareContent f67501b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f67502c;

            public C0956a(C1661a c1661a, ShareContent shareContent, boolean z10) {
                this.f67500a = c1661a;
                this.f67501b = shareContent;
                this.f67502c = z10;
            }

            @Override // T7.C1670j.a
            public Bundle a() {
                return C6655d.c(this.f67500a.c(), this.f67501b, this.f67502c);
            }

            @Override // T7.C1670j.a
            public Bundle getParameters() {
                return C6657f.g(this.f67500a.c(), this.f67501b, this.f67502c);
            }
        }

        public b() {
            super(C6721a.this);
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent shareContent, boolean z10) {
            return shareContent != null && C6721a.y(shareContent.getClass());
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(ShareContent shareContent) {
            C6659h.m(shareContent);
            C1661a e10 = C6721a.this.e();
            boolean r10 = C6721a.this.r();
            C6721a.A(C6721a.this.f(), shareContent, e10);
            C1670j.k(e10, new C0956a(e10, shareContent, r10), C6721a.z(shareContent.getClass()));
            return e10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6721a(Activity activity) {
        super(activity, r0);
        int i10 = f67497o;
        this.f67498n = false;
        C6663l.y(i10);
    }

    public static void A(Context context, ShareContent shareContent, C1661a c1661a) {
        InterfaceC1668h z10 = z(shareContent.getClass());
        String str = z10 == EnumC6656e.MESSAGE_DIALOG ? "status" : z10 == EnumC6656e.MESSENGER_GENERIC_TEMPLATE ? "GenericTemplate" : z10 == EnumC6656e.MESSENGER_MEDIA_TEMPLATE ? "MediaTemplate" : "unknown";
        C4470F c4470f = new C4470F(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", c1661a.c().toString());
        bundle.putString("fb_share_dialog_content_page_id", shareContent.getPageId());
        c4470f.g("fb_messenger_share_dialog_show", bundle);
    }

    public static boolean y(Class cls) {
        InterfaceC1668h z10 = z(cls);
        return z10 != null && C1670j.b(z10);
    }

    public static InterfaceC1668h z(Class cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return EnumC6656e.MESSAGE_DIALOG;
        }
        return null;
    }

    @Override // w8.C6725e, T7.AbstractC1671k
    public C1661a e() {
        return new C1661a(h());
    }

    @Override // w8.C6725e, T7.AbstractC1671k
    public List g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        return arrayList;
    }

    @Override // w8.C6725e, T7.AbstractC1671k
    public void k(C1665e c1665e, InterfaceC4354n interfaceC4354n) {
        C6663l.w(h(), c1665e, interfaceC4354n);
    }

    @Override // w8.C6725e
    public boolean r() {
        return this.f67498n;
    }

    @Override // w8.C6725e
    public void t(boolean z10) {
        this.f67498n = z10;
    }

    public C6721a(Activity activity, int i10) {
        super(activity, i10);
        this.f67498n = false;
        C6663l.y(i10);
    }

    public C6721a(Fragment fragment, int i10) {
        this(new B(fragment), i10);
    }

    public C6721a(android.app.Fragment fragment, int i10) {
        this(new B(fragment), i10);
    }

    public C6721a(B b10, int i10) {
        super(b10, i10);
        this.f67498n = false;
        C6663l.y(i10);
    }
}
