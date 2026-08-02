package V8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Images;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.User;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: V8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1734o extends PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12775a;

    @NotNull
    private final EnumC1720a[] actions;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f12776b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f12777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12778d;

    /* renamed from: e, reason: collision with root package name */
    public final P8.a f12779e;

    /* renamed from: f, reason: collision with root package name */
    public Media f12780f;

    /* renamed from: V8.o$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1720a.values().length];
            try {
                iArr[EnumC1720a.SearchMore.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1720a.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1720a.OpenGiphy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: V8.o$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f12781d = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
        }
    }

    /* renamed from: V8.o$c */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f12782d = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
        }
    }

    public C1734o(Context context, EnumC1720a[] actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f12775a = context;
        this.actions = actions;
        this.f12776b = c.f12782d;
        this.f12777c = b.f12781d;
        int a10 = U8.f.a(2);
        this.f12778d = a10;
        setContentView(View.inflate(context, O8.t.f8530a, null));
        P8.a a11 = P8.a.a(getContentView());
        Intrinsics.checkNotNullExpressionValue(a11, "bind(contentView)");
        this.f12779e = a11;
        setWidth(-2);
        setHeight(-2);
        setElevation(a10);
        setOverlapAnchor(true);
        a11.f8824c.setOnClickListener(k());
        a11.f8827f.setOnClickListener(e());
        a11.f8826e.setOnClickListener(n());
        a11.f8825d.setOnClickListener(g());
        for (EnumC1720a enumC1720a : actions) {
            int i10 = a.$EnumSwitchMapping$0[enumC1720a.ordinal()];
            if (i10 == 1) {
                a11.f8824c.setVisibility(0);
            } else if (i10 == 2) {
                a11.f8827f.setVisibility(0);
            } else if (i10 == 3) {
                a11.f8826e.setVisibility(0);
            }
        }
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
    }

    public static final void f(C1734o this$0, View view) {
        Images images;
        Image original;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Media media = this$0.f12780f;
        this$0.i((media == null || (images = media.getImages()) == null || (original = images.getOriginal()) == null) ? null : original.getGifUrl());
        this$0.dismiss();
    }

    public static final void h(C1734o this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f12777c;
        Media media = this$0.f12780f;
        function1.invoke(media != null ? media.getId() : null);
        this$0.dismiss();
    }

    public static final void l(C1734o this$0, View view) {
        User user;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f12776b;
        Media media = this$0.f12780f;
        function1.invoke((media == null || (user = media.getUser()) == null) ? null : user.getUsername());
        this$0.dismiss();
    }

    public static final void o(C1734o this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.f12775a;
        if (context != null) {
            context.startActivity(U8.d.f12144a.b(this$0.f12780f));
        }
        this$0.dismiss();
    }

    public final View.OnClickListener e() {
        return new View.OnClickListener() { // from class: V8.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1734o.f(C1734o.this, view);
            }
        };
    }

    public final View.OnClickListener g() {
        return new View.OnClickListener() { // from class: V8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1734o.h(C1734o.this, view);
            }
        };
    }

    public final void i(String str) {
        Context context = this.f12775a;
        Object systemService = context != null ? context.getSystemService("clipboard") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Giphy", str));
    }

    public final void j(Media media) {
        User user;
        String username;
        String str;
        String string;
        this.f12780f = media;
        this.f12779e.f8824c.setVisibility(8);
        if (media == null || media.getIsAnonymous() || !ArraysKt.contains(this.actions, EnumC1720a.SearchMore) || Intrinsics.areEqual(N8.j.b(media), Boolean.TRUE) || (user = media.getUser()) == null || (username = user.getUsername()) == null) {
            return;
        }
        TextView textView = this.f12779e.f8824c;
        Context context = this.f12775a;
        if (context == null || (string = context.getString(O8.u.f8562p)) == null) {
            str = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gph_more_by)");
            str = String.format(string, Arrays.copyOf(new Object[]{username}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        textView.setText(str);
        this.f12779e.f8824c.setVisibility(0);
        m();
    }

    public final View.OnClickListener k() {
        return new View.OnClickListener() { // from class: V8.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1734o.l(C1734o.this, view);
            }
        };
    }

    public final void m() {
        getContentView().measure(-2, -2);
        setWidth(getContentView().getMeasuredWidth());
    }

    public final View.OnClickListener n() {
        return new View.OnClickListener() { // from class: V8.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1734o.o(C1734o.this, view);
            }
        };
    }
}
