package w8;

import T7.AbstractC1671k;
import T7.B;
import T7.C1661a;
import T7.C1665e;
import T7.C1670j;
import T7.InterfaceC1668h;
import T7.K;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import g6.C4331C;
import g6.InterfaceC4354n;
import h6.C4470F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v8.C6655d;
import v8.C6657f;
import v8.C6659h;
import v8.C6663l;
import v8.C6665n;
import v8.EnumC6652a;
import v8.EnumC6660i;
import v8.EnumC6664m;

/* renamed from: w8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6725e extends AbstractC1671k {

    /* renamed from: k, reason: collision with root package name */
    public static final b f67509k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    public static final String f67510l = C6725e.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    public static final int f67511m = C1665e.c.Share.b();

    /* renamed from: h, reason: collision with root package name */
    public boolean f67512h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f67513i;

    /* renamed from: j, reason: collision with root package name */
    public final List f67514j;

    /* renamed from: w8.e$a */
    public final class a extends AbstractC1671k.b {

        /* renamed from: c, reason: collision with root package name */
        public Object f67515c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C6725e f67516d;

        /* renamed from: w8.e$a$a, reason: collision with other inner class name */
        public static final class C0957a implements C1670j.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1661a f67517a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareContent f67518b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f67519c;

            public C0957a(C1661a c1661a, ShareContent shareContent, boolean z10) {
                this.f67517a = c1661a;
                this.f67518b = shareContent;
                this.f67519c = z10;
            }

            @Override // T7.C1670j.a
            public Bundle a() {
                C6655d c6655d = C6655d.f67069a;
                return C6655d.c(this.f67517a.c(), this.f67518b, this.f67519c);
            }

            @Override // T7.C1670j.a
            public Bundle getParameters() {
                C6657f c6657f = C6657f.f67077a;
                return C6657f.g(this.f67517a.c(), this.f67518b, this.f67519c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6725e this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f67516d = this$0;
            this.f67515c = d.NATIVE;
        }

        @Override // T7.AbstractC1671k.b
        public Object c() {
            return this.f67515c;
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof ShareCameraEffectContent) && C6725e.f67509k.d(content.getClass());
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(ShareContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            C6659h.n(content);
            C1661a e10 = this.f67516d.e();
            boolean r10 = this.f67516d.r();
            InterfaceC1668h g10 = C6725e.f67509k.g(content.getClass());
            if (g10 == null) {
                return null;
            }
            C1670j c1670j = C1670j.f11136a;
            C1670j.k(e10, new C0957a(e10, content, r10), g10);
            return e10;
        }
    }

    /* renamed from: w8.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean d(Class cls) {
            InterfaceC1668h g10 = g(cls);
            return g10 != null && C1670j.b(g10);
        }

        public final boolean e(ShareContent shareContent) {
            return f(shareContent.getClass());
        }

        public final boolean f(Class cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return true;
            }
            return SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.INSTANCE.g();
        }

        public final InterfaceC1668h g(Class cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return EnumC6660i.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return EnumC6660i.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return EnumC6660i.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return EnumC6660i.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return EnumC6652a.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return EnumC6664m.SHARE_STORY_ASSET;
            }
            return null;
        }

        public b() {
        }
    }

    /* renamed from: w8.e$c */
    public final class c extends AbstractC1671k.b {

        /* renamed from: c, reason: collision with root package name */
        public Object f67520c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C6725e f67521d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6725e this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f67521d = this$0;
            this.f67520c = d.FEED;
        }

        @Override // T7.AbstractC1671k.b
        public Object c() {
            return this.f67520c;
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof ShareLinkContent) || (content instanceof ShareFeedContent);
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(ShareContent content) {
            Bundle e10;
            Intrinsics.checkNotNullParameter(content, "content");
            C6725e c6725e = this.f67521d;
            c6725e.s(c6725e.f(), content, d.FEED);
            C1661a e11 = this.f67521d.e();
            if (content instanceof ShareLinkContent) {
                C6659h.p(content);
                e10 = C6665n.f((ShareLinkContent) content);
            } else {
                if (!(content instanceof ShareFeedContent)) {
                    return null;
                }
                e10 = C6665n.e((ShareFeedContent) content);
            }
            C1670j.m(e11, "feed", e10);
            return e11;
        }
    }

    /* renamed from: w8.e$d */
    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: w8.e$e, reason: collision with other inner class name */
    public final class C0958e extends AbstractC1671k.b {

        /* renamed from: c, reason: collision with root package name */
        public Object f67526c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C6725e f67527d;

        /* renamed from: w8.e$e$a */
        public static final class a implements C1670j.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1661a f67528a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareContent f67529b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f67530c;

            public a(C1661a c1661a, ShareContent shareContent, boolean z10) {
                this.f67528a = c1661a;
                this.f67529b = shareContent;
                this.f67530c = z10;
            }

            @Override // T7.C1670j.a
            public Bundle a() {
                C6655d c6655d = C6655d.f67069a;
                return C6655d.c(this.f67528a.c(), this.f67529b, this.f67530c);
            }

            @Override // T7.C1670j.a
            public Bundle getParameters() {
                C6657f c6657f = C6657f.f67077a;
                return C6657f.g(this.f67528a.c(), this.f67529b, this.f67530c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0958e(C6725e this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f67527d = this$0;
            this.f67526c = d.NATIVE;
        }

        @Override // T7.AbstractC1671k.b
        public Object c() {
            return this.f67526c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        
            if (T7.C1670j.b(v8.EnumC6660i.LINK_SHARE_QUOTES) != false) goto L25;
         */
        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(ShareContent content, boolean z10) {
            boolean z11;
            String quote;
            Intrinsics.checkNotNullParameter(content, "content");
            if (!(content instanceof ShareCameraEffectContent) && !(content instanceof ShareStoryContent)) {
                if (!z10) {
                    if (content.getShareHashtag() != null) {
                        C1670j c1670j = C1670j.f11136a;
                        z11 = C1670j.b(EnumC6660i.HASHTAG);
                    } else {
                        z11 = true;
                    }
                    if ((content instanceof ShareLinkContent) && (quote = ((ShareLinkContent) content).getQuote()) != null && quote.length() != 0) {
                        if (z11) {
                            C1670j c1670j2 = C1670j.f11136a;
                        }
                        z11 = false;
                    }
                    if (!z11 && C6725e.f67509k.d(content.getClass())) {
                        return true;
                    }
                }
                z11 = true;
                if (!z11) {
                }
            }
            return false;
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(ShareContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            C6725e c6725e = this.f67527d;
            c6725e.s(c6725e.f(), content, d.NATIVE);
            C6659h.n(content);
            C1661a e10 = this.f67527d.e();
            boolean r10 = this.f67527d.r();
            InterfaceC1668h g10 = C6725e.f67509k.g(content.getClass());
            if (g10 == null) {
                return null;
            }
            C1670j c1670j = C1670j.f11136a;
            C1670j.k(e10, new a(e10, content, r10), g10);
            return e10;
        }
    }

    /* renamed from: w8.e$f */
    public final class f extends AbstractC1671k.b {

        /* renamed from: c, reason: collision with root package name */
        public Object f67531c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C6725e f67532d;

        /* renamed from: w8.e$f$a */
        public static final class a implements C1670j.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1661a f67533a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShareContent f67534b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f67535c;

            public a(C1661a c1661a, ShareContent shareContent, boolean z10) {
                this.f67533a = c1661a;
                this.f67534b = shareContent;
                this.f67535c = z10;
            }

            @Override // T7.C1670j.a
            public Bundle a() {
                C6655d c6655d = C6655d.f67069a;
                return C6655d.c(this.f67533a.c(), this.f67534b, this.f67535c);
            }

            @Override // T7.C1670j.a
            public Bundle getParameters() {
                C6657f c6657f = C6657f.f67077a;
                return C6657f.g(this.f67533a.c(), this.f67534b, this.f67535c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C6725e this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f67532d = this$0;
            this.f67531c = d.NATIVE;
        }

        @Override // T7.AbstractC1671k.b
        public Object c() {
            return this.f67531c;
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return (content instanceof ShareStoryContent) && C6725e.f67509k.d(content.getClass());
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1661a b(ShareContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            C6659h.o(content);
            C1661a e10 = this.f67532d.e();
            boolean r10 = this.f67532d.r();
            InterfaceC1668h g10 = C6725e.f67509k.g(content.getClass());
            if (g10 == null) {
                return null;
            }
            C1670j c1670j = C1670j.f11136a;
            C1670j.k(e10, new a(e10, content, r10), g10);
            return e10;
        }
    }

    /* renamed from: w8.e$g */
    public final class g extends AbstractC1671k.b {

        /* renamed from: c, reason: collision with root package name */
        public Object f67536c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C6725e f67537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C6725e this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f67537d = this$0;
            this.f67536c = d.WEB;
        }

        @Override // T7.AbstractC1671k.b
        public Object c() {
            return this.f67536c;
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent content, boolean z10) {
            Intrinsics.checkNotNullParameter(content, "content");
            return C6725e.f67509k.e(content);
        }

        public final SharePhotoContent e(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.a r10 = new SharePhotoContent.a().r(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.getPhotos().size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    SharePhoto sharePhoto = (SharePhoto) sharePhotoContent.getPhotos().get(i10);
                    Bitmap bitmap = sharePhoto.getBitmap();
                    if (bitmap != null) {
                        K.a d10 = K.d(uuid, bitmap);
                        sharePhoto = new SharePhoto.a().i(sharePhoto).m(Uri.parse(d10.b())).k(null).d();
                        arrayList2.add(d10);
                    }
                    arrayList.add(sharePhoto);
                    if (i11 > size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            r10.s(arrayList);
            K.a(arrayList2);
            return r10.p();
        }

        @Override // T7.AbstractC1671k.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1661a b(ShareContent content) {
            Bundle c10;
            Intrinsics.checkNotNullParameter(content, "content");
            C6725e c6725e = this.f67537d;
            c6725e.s(c6725e.f(), content, d.WEB);
            C1661a e10 = this.f67537d.e();
            C6659h.p(content);
            if (content instanceof ShareLinkContent) {
                c10 = C6665n.b((ShareLinkContent) content);
            } else {
                if (!(content instanceof SharePhotoContent)) {
                    return null;
                }
                c10 = C6665n.c(e((SharePhotoContent) content, e10.c()));
            }
            C1670j c1670j = C1670j.f11136a;
            C1670j.m(e10, g(content), c10);
            return e10;
        }

        public final String g(ShareContent shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            return null;
        }
    }

    /* renamed from: w8.e$h */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.WEB.ordinal()] = 2;
            iArr[d.NATIVE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6725e(Activity activity) {
        this(activity, f67511m);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // T7.AbstractC1671k
    public C1661a e() {
        return new C1661a(h(), null, 2, null);
    }

    @Override // T7.AbstractC1671k
    public List g() {
        return this.f67514j;
    }

    @Override // T7.AbstractC1671k
    public void k(C1665e callbackManager, InterfaceC4354n callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C6663l c6663l = C6663l.f67094a;
        C6663l.w(h(), callbackManager, callback);
    }

    public boolean q(ShareContent content, d mode) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Object obj = mode;
        if (mode == d.AUTOMATIC) {
            obj = AbstractC1671k.f11138g;
        }
        return c(content, obj);
    }

    public boolean r() {
        return this.f67512h;
    }

    public final void s(Context context, ShareContent shareContent, d dVar) {
        if (this.f67513i) {
            dVar = d.AUTOMATIC;
        }
        int i10 = h.$EnumSwitchMapping$0[dVar.ordinal()];
        String str = "unknown";
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "native" : "web" : "automatic";
        InterfaceC1668h g10 = f67509k.g(shareContent.getClass());
        if (g10 == EnumC6660i.SHARE_DIALOG) {
            str = "status";
        } else if (g10 == EnumC6660i.PHOTOS) {
            str = "photo";
        } else if (g10 == EnumC6660i.VIDEO) {
            str = "video";
        }
        C4470F a10 = C4470F.f47729b.a(context, C4331C.m());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str2);
        bundle.putString("fb_share_dialog_content_type", str);
        a10.g("fb_share_dialog_show", bundle);
    }

    public void t(boolean z10) {
        this.f67512h = z10;
    }

    public void u(ShareContent content, d mode) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z10 = mode == d.AUTOMATIC;
        this.f67513i = z10;
        Object obj = mode;
        if (z10) {
            obj = AbstractC1671k.f11138g;
        }
        n(content, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6725e(Activity activity, int i10) {
        super(activity, i10);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f67513i = true;
        this.f67514j = CollectionsKt.arrayListOf(new C0958e(this), new c(this), new g(this), new a(this), new f(this));
        C6663l.y(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6725e(Fragment fragment, int i10) {
        this(new B(fragment), i10);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6725e(android.app.Fragment fragment, int i10) {
        this(new B(fragment), i10);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6725e(B fragmentWrapper, int i10) {
        super(fragmentWrapper, i10);
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.f67513i = true;
        this.f67514j = CollectionsKt.arrayListOf(new C0958e(this), new c(this), new g(this), new a(this), new f(this));
        C6663l.y(i10);
    }
}
