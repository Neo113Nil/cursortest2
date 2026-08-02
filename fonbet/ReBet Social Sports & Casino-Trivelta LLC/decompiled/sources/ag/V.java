package ag;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.C3948q;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import od.AbstractC5886l;
import og.AbstractC5892d;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public final class V extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public ImageView f15511Q4;

    /* renamed from: R4, reason: collision with root package name */
    public final View f15512R4;

    /* renamed from: S4, reason: collision with root package name */
    public final ConstraintLayout f15513S4;

    /* renamed from: T4, reason: collision with root package name */
    public RelativeLayout f15514T4;

    /* renamed from: U4, reason: collision with root package name */
    public final CircularProgressIndicator f15515U4;

    /* renamed from: V4, reason: collision with root package name */
    public ImageView f15516V4;

    /* renamed from: W4, reason: collision with root package name */
    public final ImageView f15517W4;

    /* renamed from: X4, reason: collision with root package name */
    public final RelativeLayout f15518X4;

    /* renamed from: Y4, reason: collision with root package name */
    public final TextView f15519Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public final AppCompatImageView f15520Z4;

    /* renamed from: a5, reason: collision with root package name */
    public final MobilistenTextView f15521a5;

    /* renamed from: b5, reason: collision with root package name */
    public final ConstraintLayout f15522b5;

    /* renamed from: c5, reason: collision with root package name */
    public SalesIQChat f15523c5;

    /* renamed from: d5, reason: collision with root package name */
    public MobilistenTextView f15524d5;

    /* renamed from: e5, reason: collision with root package name */
    public View f15525e5;

    /* renamed from: f5, reason: collision with root package name */
    public View f15526f5;

    /* renamed from: g5, reason: collision with root package name */
    public final View.OnClickListener f15527g5;

    /* renamed from: h5, reason: collision with root package name */
    public final int f15528h5;

    /* renamed from: i5, reason: collision with root package name */
    public final int f15529i5;

    /* renamed from: j5, reason: collision with root package name */
    public final int f15530j5;

    public static final class a extends Lambda implements Function2 {
        public a() {
            super(2);
        }

        public final void a(Boolean bool, Message message) {
            if ((message != null ? message.getStatus() : null) == Message.f.Sent) {
                Message.Extras extras = message.getExtras();
                int m10 = og.i.m(extras != null ? Long.valueOf(extras.getLocalFileSize()) : null);
                Message.Attachment attachment = message.getAttachment();
                if (m10 < og.i.m(attachment != null ? Long.valueOf(attachment.getSize()) : null) && !C3948q.b().c(message.getId())) {
                    V.this.f15515U4.j();
                    V.this.o2();
                    return;
                }
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                V v10 = V.this;
                SalesIQChat salesIQChat = v10.f15523c5;
                Intrinsics.checkNotNull(message);
                v10.F1(salesIQChat, message);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Boolean) obj, (Message) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements L4.g {
        public b() {
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            return false;
        }

        @Override // L4.g
        public boolean k(com.bumptech.glide.load.engine.q qVar, Object obj, M4.j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            ImageView imageView = V.this.f15511Q4;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView = null;
            }
            imageView.setImageDrawable(null);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(View view, ConstraintLayout currentLayoutParent, final cg.e eVar) {
        super(view, eVar);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(currentLayoutParent, "currentLayoutParent");
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ag.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                V.n2(V.this, eVar, view2);
            }
        };
        this.f15527g5 = onClickListener;
        ImageView imageView = null;
        int h10 = AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59857m), 0.0f, 2, null);
        this.f15528h5 = h10;
        int h11 = AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59869o2), 0.0f, 2, null);
        this.f15529i5 = h11;
        this.f15530j5 = AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59850k2), 0.0f, 2, null);
        super.K1(currentLayoutParent);
        this.f15524d5 = (MobilistenTextView) view.findViewById(od.q.f60498d5);
        View findViewById = view.findViewById(od.q.f60643r6);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f15511Q4 = (ImageView) findViewById;
        View findViewById2 = view.findViewById(od.q.f60653s6);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f15512R4 = findViewById2;
        ImageView imageView2 = this.f15511Q4;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            imageView = imageView2;
        }
        imageView.setOnLongClickListener(t0());
        findViewById2.setOnLongClickListener(t0());
        findViewById2.setOnClickListener(onClickListener);
        View findViewById3 = view.findViewById(od.q.f60663t6);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById3;
        this.f15513S4 = constraintLayout;
        View findViewById4 = view.findViewById(od.q.f60612o5);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f15514T4 = (RelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(od.q.f60592m5);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f15515U4 = (CircularProgressIndicator) findViewById5;
        this.f15516V4 = (ImageView) view.findViewById(od.q.f60602n5);
        View findViewById6 = view.findViewById(od.q.f60290J0);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f15518X4 = (RelativeLayout) findViewById6;
        constraintLayout.setOnLongClickListener(t0());
        this.f15514T4.setOnLongClickListener(t0());
        View findViewById7 = view.findViewById(od.q.f60330N0);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        ImageView imageView3 = (ImageView) findViewById7;
        this.f15517W4 = imageView3;
        imageView3.setColorFilter(h10);
        View findViewById8 = view.findViewById(od.q.f60300K0);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        TextView textView = (TextView) findViewById8;
        this.f15519Y4 = textView;
        textView.setTextColor(h10);
        View findViewById9 = view.findViewById(od.q.f60520f5);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f15522b5 = (ConstraintLayout) findViewById9;
        View findViewById10 = view.findViewById(od.q.f60509e5);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f15520Z4 = (AppCompatImageView) findViewById10;
        View findViewById11 = view.findViewById(od.q.f60531g5);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        MobilistenTextView mobilistenTextView = (MobilistenTextView) findViewById11;
        this.f15521a5 = mobilistenTextView;
        mobilistenTextView.setTextColor(h11);
        this.f15514T4.setOnClickListener(new View.OnClickListener() { // from class: ag.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                V.d2(V.this, eVar, view2);
            }
        });
        this.f15526f5 = this.itemView.findViewById(od.q.f60339O);
        View findViewById12 = this.itemView.findViewById(od.q.f60656t);
        findViewById12.setOnClickListener(onClickListener);
        findViewById12.setOnLongClickListener(t0());
        this.f15525e5 = findViewById12;
    }

    public static final void d2(V this$0, cg.e eVar, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SalesIQChat salesIQChat = this$0.f15523c5;
        Intrinsics.checkNotNull(salesIQChat);
        Message q02 = this$0.q0();
        Intrinsics.checkNotNull(q02);
        this$0.c1(salesIQChat, q02, this$0.f15516V4, eVar, this$0.new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k2(final Ref.ObjectRef file, final Ref.LongRef localFileSize, final V this$0, final Message message) {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(localFileSize, "$localFileSize");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        File file2 = (File) file.element;
        if (file2 == null || !file2.exists() || localFileSize.element <= 0) {
            this$0.itemView.post(new Runnable() { // from class: ag.U
                @Override // java.lang.Runnable
                public final void run() {
                    V.m2(V.this, localFileSize, message);
                }
            });
        } else {
            this$0.itemView.post(new Runnable() { // from class: ag.T
                @Override // java.lang.Runnable
                public final void run() {
                    V.l2(V.this, message, file);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l2(V this$0, Message message, Ref.ObjectRef file) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        Intrinsics.checkNotNullParameter(file, "$file");
        ImageView imageView2 = this$0.f15511Q4;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView2 = null;
        }
        og.p.w(imageView2);
        og.p.n(this$0.f15512R4);
        if (message.getMessageType() == Message.g.Image) {
            og.p.n(this$0.f15518X4);
        } else {
            og.p.w(this$0.f15518X4);
        }
        wd.d dVar = wd.d.f67581a;
        ImageView imageView3 = this$0.f15511Q4;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        } else {
            imageView = imageView3;
        }
        T t10 = file.element;
        wd.d.K(imageView, (File) t10, null, false, false, this$0.new b(), null, null, ((File) t10).getAbsolutePath(), Float.valueOf(10.0f), false, null, 3292, null);
    }

    public static final void m2(V this$0, Ref.LongRef localFileSize, Message message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(localFileSize, "$localFileSize");
        Intrinsics.checkNotNullParameter(message, "$message");
        og.p.w(this$0.f15518X4);
        localFileSize.element = 0L;
        cg.e o02 = this$0.o0();
        if (o02 != null) {
            o02.l(message);
        }
    }

    public static final void n2(V this$0, cg.e eVar, View view) {
        Message.Attachment attachment;
        Message q02;
        Message.Extras extras;
        String localFilePath;
        String localFilePath2;
        Message.Attachment attachment2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Message q03 = this$0.q0();
        Long l10 = null;
        ImageView imageView = null;
        l10 = null;
        if ((q03 != null ? q03.getAttachment() : null) != null && ((q02 = this$0.q0()) == null || (attachment2 = q02.getAttachment()) == null || attachment2.getSize() != 0)) {
            Message q04 = this$0.q0();
            Intrinsics.checkNotNull(q04);
            Message.Extras extras2 = q04.getExtras();
            if (og.i.r((extras2 == null || (localFilePath2 = extras2.getLocalFilePath()) == null) ? null : Long.valueOf(new File(localFilePath2).length())) > 0) {
                Message q05 = this$0.q0();
                if ((q05 != null ? q05.getMessageType() : null) == Message.g.Image) {
                    if (eVar != null) {
                        ImageView imageView2 = this$0.f15511Q4;
                        if (imageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imageView");
                        } else {
                            imageView = imageView2;
                        }
                        eVar.U(imageView, this$0.q0());
                        return;
                    }
                    return;
                }
                Message q06 = this$0.q0();
                if (q06 == null || (extras = q06.getExtras()) == null || (localFilePath = extras.getLocalFilePath()) == null || eVar == null) {
                    return;
                }
                eVar.T(new File(localFilePath));
                return;
            }
        }
        if (this$0.q0() != null) {
            C3948q b10 = C3948q.b();
            Message q07 = this$0.q0();
            if (b10.c(q07 != null ? q07.getId() : null)) {
                return;
            }
            SalesIQChat salesIQChat = this$0.f15523c5;
            Message q08 = this$0.q0();
            Intrinsics.checkNotNull(q08);
            HttpUrl.Builder W10 = this$0.W(salesIQChat, q08.getAttachment());
            C3948q b11 = C3948q.b();
            Message q09 = this$0.q0();
            String chatId = q09 != null ? q09.getChatId() : null;
            Message q010 = this$0.q0();
            String id2 = q010 != null ? q010.getId() : null;
            com.zoho.livechat.android.utils.y yVar = com.zoho.livechat.android.utils.y.INSTANCE;
            Message q011 = this$0.q0();
            Intrinsics.checkNotNull(q011);
            Message.Attachment attachment3 = q011.getAttachment();
            String fileName = attachment3 != null ? attachment3.getFileName() : null;
            Message q012 = this$0.q0();
            String fileName2 = yVar.getFileName(fileName, og.i.s(q012 != null ? q012.getId() : null));
            Message q013 = this$0.q0();
            if (q013 != null && (attachment = q013.getAttachment()) != null) {
                l10 = Long.valueOf(attachment.getSize());
            }
            b11.a(chatId, id2, W10, fileName2, og.i.r(l10));
            ImageView imageView3 = this$0.f15516V4;
            if (imageView3 != null) {
                imageView3.setImageResource(od.p.f60158r3);
            }
            int b12 = og.k.b(4);
            ImageView imageView4 = this$0.f15516V4;
            if (imageView4 != null) {
                imageView4.setPadding(b12, b12, b12, b12);
            }
            SalesIQChat salesIQChat2 = this$0.f15523c5;
            Message q014 = this$0.q0();
            Intrinsics.checkNotNull(q014);
            this$0.F1(salesIQChat2, q014);
        }
    }

    private final void p2() {
        this.f15520Z4.setImageResource(od.p.f59978H);
        ImageView s02 = s0();
        if (s02 != null) {
            s02.setImageResource(od.p.f59978H);
        }
        ImageView imageView = this.f15516V4;
        if (imageView != null) {
            imageView.setImageResource(od.p.f59980H1);
        }
        int b10 = og.k.b(4);
        ImageView imageView2 = this.f15516V4;
        if (imageView2 != null) {
            imageView2.setPadding(b10, b10, b10, b10);
        }
        this.f15515U4.setVisibility(8);
    }

    @Override // ag.H
    public MobilistenTextView A0() {
        return this.f15524d5;
    }

    @Override // ag.H
    public MobilistenTextView B0() {
        return this.f15521a5;
    }

    @Override // ag.H
    public void N1(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.N1(message);
        i2(message);
        MobilistenTextView mobilistenTextView = this.f15524d5;
        if (mobilistenTextView != null) {
            mobilistenTextView.setTextColor(this.f15530j5);
        }
        if (message.getHasComment()) {
            og.p.n(this.f15522b5);
        } else {
            og.p.w(this.f15522b5);
        }
    }

    public final void i2(Message message) {
        ImageView imageView;
        boolean hasComment = message.getHasComment();
        ImageView imageView2 = this.f15511Q4;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        } else {
            imageView = imageView2;
        }
        og.p.i(imageView, hasComment ? H.l0() : null, !hasComment ? Integer.valueOf(H.U0()) : null, null, null, null, false, 60, null);
        og.p.i(this.f15512R4, hasComment ? H.l0() : null, !hasComment ? Integer.valueOf(H.U0()) : null, Integer.valueOf(androidx.core.content.res.k.d(d0().getResources(), od.n.f59927g, d0().getTheme())), null, null, false, 56, null);
        View view = this.f15526f5;
        if (view != null) {
            og.p.i(view, hasComment ? H.l0() : null, !hasComment ? Integer.valueOf(H.U0()) : null, Integer.valueOf(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59772T2), 0.0f, 2, null)), null, null, false, 56, null);
        }
        View view2 = this.f15525e5;
        if (view2 != null) {
            og.p.i(view2, hasComment ? H.l0() : null, !hasComment ? Integer.valueOf(H.U0()) : null, null, new int[]{Color.parseColor("#00000000"), Color.parseColor("#21000000"), Color.parseColor("#70000000")}, GradientDrawable.Orientation.TOP_BOTTOM, false, 36, null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [T, java.io.File] */
    public final void j2(SalesIQChat salesIQChat, final Message message) {
        ImageView s02;
        Intrinsics.checkNotNullParameter(message, "message");
        F1(salesIQChat, message);
        MobilistenTextView mobilistenTextView = this.f15524d5;
        ImageView imageView = null;
        ImageView imageView2 = null;
        if (mobilistenTextView != null) {
            mobilistenTextView.setTextColor(AbstractC5892d.h(d0(), Integer.valueOf(x1() ? AbstractC5886l.f59792Y2 : AbstractC5886l.f59788X2), 0.0f, 2, null));
        }
        M1(message);
        this.f15523c5 = salesIQChat;
        og.p.n(this.f15512R4);
        this.f15515U4.setVisibility(8);
        this.f15513S4.setVisibility(8);
        og.p.n(this.f15518X4);
        if (message.getAttachment() != null) {
            if (x1()) {
                ImageView imageView3 = this.f15516V4;
                if (imageView3 != null) {
                    imageView3.setColorFilter(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59698B0), 0.0f, 2, null));
                }
                this.f15515U4.setIndicatorColor(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59698B0), 0.0f, 2, null));
            } else {
                ImageView imageView4 = this.f15516V4;
                if (imageView4 != null) {
                    imageView4.setColorFilter(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59694A0), 0.0f, 2, null));
                }
                this.f15515U4.setIndicatorColor(AbstractC5892d.h(d0(), Integer.valueOf(AbstractC5886l.f59694A0), 0.0f, 2, null));
            }
            Message.g messageType = message.getMessageType();
            Message.g gVar = Message.g.Video;
            if (messageType == gVar) {
                this.f15517W4.setImageDrawable(androidx.core.content.res.k.f(d0().getResources(), od.p.f59985I1, d0().getTheme()));
            } else if (message.getAttachment().getType() == null || !StringsKt.contains$default((CharSequence) message.getAttachment().getType(), (CharSequence) "gif", false, 2, (Object) null)) {
                this.f15517W4.setImageDrawable(androidx.core.content.res.k.f(d0().getResources(), od.p.f60178v3, d0().getTheme()));
            } else {
                this.f15517W4.setImageDrawable(androidx.core.content.res.k.f(d0().getResources(), od.p.f60094f, d0().getTheme()));
            }
            ImageView s03 = s0();
            if (s03 != null) {
                og.p.n(s03);
            }
            if (w1()) {
                this.f15520Z4.setVisibility(8);
            } else {
                this.f15520Z4.setVisibility(0);
                H.s1(this, message, false, null, 6, null);
                if (Message.f.Companion.b(message.getStatus())) {
                    this.f15520Z4.setVisibility(8);
                }
            }
            if (og.i.f(message.getComment())) {
                this.f15522b5.setVisibility(8);
                if (w1()) {
                    ImageView s04 = s0();
                    if (s04 != null) {
                        s04.setVisibility(8);
                    }
                } else {
                    ImageView s05 = s0();
                    if (s05 != null) {
                        s05.setVisibility(0);
                    }
                    H.s1(this, message, false, null, 6, null);
                    if (Message.f.Companion.b(message.getStatus()) && (s02 = s0()) != null) {
                        s02.setVisibility(8);
                    }
                }
            } else {
                this.f15522b5.setVisibility(0);
                if (w1()) {
                    this.f15520Z4.setVisibility(8);
                } else {
                    this.f15520Z4.setVisibility(0);
                    H.s1(this, message, false, null, 6, null);
                    if (Message.f.Companion.b(message.getStatus())) {
                        this.f15520Z4.setVisibility(8);
                    }
                }
            }
            Message.Extras extras = message.getExtras();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.LongRef longRef = new Ref.LongRef();
            og.p.n(this.f15512R4);
            if (extras != null) {
                longRef.element = extras.getLocalFileSize();
                if (extras.getLocalFilePath() != null) {
                    objectRef.element = new File(extras.getLocalFilePath());
                }
                LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: ag.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        V.k2(Ref.ObjectRef.this, longRef, this, message);
                    }
                });
            }
            if (og.i.f(extras != null ? extras.getMediaDurationText() : null)) {
                this.f15519Y4.setText(extras != null ? extras.getMediaDurationText() : null);
            } else {
                this.f15519Y4.setText(og.j.d(message.getAttachment().getSize()));
            }
            if (message.getStatus() != Message.f.Sent) {
                this.f15512R4.setVisibility(8);
                this.f15513S4.setVisibility(0);
                ImageView imageView5 = this.f15516V4;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
                if (Message.f.Companion.b(message.getStatus())) {
                    p2();
                    return;
                } else {
                    q2(true);
                    return;
                }
            }
            if (longRef.element >= message.getAttachment().getSize()) {
                if (message.getMessageType() != gVar) {
                    ImageView imageView6 = this.f15516V4;
                    if (imageView6 == null) {
                        return;
                    }
                    imageView6.setVisibility(8);
                    return;
                }
                this.f15513S4.setVisibility(0);
                ImageView imageView7 = this.f15516V4;
                if (imageView7 != null) {
                    imageView7.setImageResource(od.p.f60134n);
                }
                ImageView imageView8 = this.f15516V4;
                if (imageView8 != null) {
                    imageView8.setPadding(0, 0, 0, 0);
                }
                this.f15519Y4.setText(extras != null ? extras.getMediaDurationText() : null);
                return;
            }
            this.f15513S4.setVisibility(0);
            ImageView imageView9 = this.f15516V4;
            if (imageView9 != null) {
                imageView9.setVisibility(0);
            }
            if (message.getAttachment().getBlurImage() != null) {
                ImageView imageView10 = this.f15511Q4;
                if (imageView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                    imageView10 = null;
                }
                og.p.w(imageView10);
                byte[] decode = Base64.decode(message.getAttachment().getBlurImage(), 0);
                WeakReference weakReference = new WeakReference(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                ImageView imageView11 = this.f15511Q4;
                if (imageView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                } else {
                    imageView2 = imageView11;
                }
                imageView2.setImageBitmap((Bitmap) weakReference.get());
            } else {
                ImageView imageView12 = this.f15511Q4;
                if (imageView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                } else {
                    imageView = imageView12;
                }
                og.p.n(imageView);
                og.p.w(this.f15512R4);
            }
            if (C3948q.b().c(message.getId())) {
                q2(true);
            } else {
                this.f15515U4.j();
                o2();
            }
        }
    }

    public final void o2() {
        this.f15515U4.setVisibility(8);
        ImageView imageView = this.f15516V4;
        if (imageView != null) {
            imageView.setImageResource(od.p.f60004M0);
        }
        ImageView imageView2 = this.f15516V4;
        if (imageView2 != null) {
            imageView2.setPadding(0, 0, 0, 0);
        }
    }

    public final void q2(boolean z10) {
        ImageView imageView = this.f15516V4;
        if (imageView != null) {
            imageView.setImageResource(od.p.f60158r3);
        }
        int b10 = og.k.b(4);
        ImageView imageView2 = this.f15516V4;
        if (imageView2 != null) {
            imageView2.setPadding(b10, b10, b10, b10);
        }
        this.f15515U4.setVisibility(0);
        if (!z10 || this.f15515U4.isIndeterminate()) {
            return;
        }
        this.f15515U4.setIndeterminate(true);
    }

    @Override // ag.H
    public void r1(Message message, boolean z10, ImageView imageView) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (x1()) {
            AppCompatImageView appCompatImageView = this.f15520Z4;
            if (message.getComment() != null) {
                appCompatImageView = null;
            }
            super.r1(message, z10, appCompatImageView);
            if (Message.f.Companion.b(message.getStatus())) {
                this.f15520Z4.setVisibility(8);
                p2();
            } else if (message.getStatus() == Message.f.Uploading) {
                q2(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r5 > (-1)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r2(String messageId, int i10) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Message q02 = q0();
        if ((q02 != null ? q02.getStatus() : null) != Message.f.Uploading) {
            if (C3948q.b().c(messageId)) {
                Message q03 = q0();
                if (Intrinsics.areEqual(q03 != null ? q03.getId() : null, messageId)) {
                    if (getBindingAdapterPosition() != -1) {
                    }
                }
            }
            Message q04 = q0();
            if ((q04 != null ? q04.getStatus() : null) == Message.f.Sent) {
                o2();
                return;
            }
            return;
        }
        q2(false);
        if (this.f15515U4.isIndeterminate()) {
            this.f15515U4.setIndeterminate(false);
        }
        this.f15515U4.setProgress(i10);
    }
}
