package com.vk.clips.design.view.component.video.preview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.clips.tool.view.component.video.ClipProgressIndicator;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.cut0;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.heh0;
import xsna.k14;
import xsna.obd;
import xsna.rzt0;
import xsna.s3q0;
import xsna.shy;
import xsna.tlo0;
import xsna.uf3;
import xsna.vut0;
import xsna.wut0;
import xsna.wzs;
import xsna.x7g;
import xsna.z7g;
import xsna.zrp;

/* compiled from: ClipRectanglePreview.kt */
/* loaded from: classes16.dex */
public final class ClipRectanglePreview extends FrameLayout {
    public static final /* synthetic */ int x = 0;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final ImageView f;
    public final ClipProgressIndicator g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final ViewGroup k;
    public vut0 l;
    public double m;
    public boolean n;
    public boolean o;
    public PreviewItem.b p;
    public PreviewItem.Icon q;
    public PreviewItem.Icon r;
    public PreviewItem.Icon s;
    public PreviewItem.c t;
    public PreviewItem.b u;
    public PreviewItem.b v;
    public PreviewItem.a w;

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<PreviewItem.a, View, s3q0> {
        public static final a b = new a(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Content;Landroid/view/View;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.a aVar, View view) {
            View view2 = view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            aVar.getClass();
            layoutParams.width = -1;
            layoutParams.height = -1;
            view2.setLayoutParams(layoutParams);
            return s3q0.a;
        }
    }

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<PreviewItem.b, TextView, s3q0> {
        public static final b b = new b(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Label;Landroid/widget/TextView;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.b bVar, TextView textView) {
            com.vk.clips.design.view.component.video.preview.a.b(bVar, textView);
            return s3q0.a;
        }
    }

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<PreviewItem.Icon, ImageView, s3q0> {
        public static final c b = new c(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Icon;Landroid/widget/ImageView;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.Icon icon, ImageView imageView) {
            com.vk.clips.design.view.component.video.preview.a.a(icon, imageView);
            return s3q0.a;
        }
    }

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<PreviewItem.Icon, ImageView, s3q0> {
        public static final d b = new d(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Icon;Landroid/widget/ImageView;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.Icon icon, ImageView imageView) {
            com.vk.clips.design.view.component.video.preview.a.a(icon, imageView);
            return s3q0.a;
        }
    }

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements wzs<PreviewItem.b, TextView, s3q0> {
        public static final e b = new e(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Label;Landroid/widget/TextView;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.b bVar, TextView textView) {
            com.vk.clips.design.view.component.video.preview.a.b(bVar, textView);
            return s3q0.a;
        }
    }

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements wzs<PreviewItem.b, TextView, s3q0> {
        public static final f b = new f(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Label;Landroid/widget/TextView;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.b bVar, TextView textView) {
            com.vk.clips.design.view.component.video.preview.a.b(bVar, textView);
            return s3q0.a;
        }
    }

    /* compiled from: ClipRectanglePreview.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements wzs<PreviewItem.Icon, ImageView, s3q0> {
        public static final g b = new g(2, com.vk.clips.design.view.component.video.preview.a.class, "applyTo", "applyTo(Lcom/vk/clips/design/view/component/video/preview/ClipRectanglePreview$PreviewItem$Icon;Landroid/widget/ImageView;)V", 1);

        @Override // xsna.wzs
        public final s3q0 invoke(PreviewItem.Icon icon, ImageView imageView) {
            com.vk.clips.design.view.component.video.preview.a.a(icon, imageView);
            return s3q0.a;
        }
    }

    public ClipRectanglePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = 1.773109243697479d;
        this.n = true;
        this.o = true;
        LayoutInflater.from(context).inflate(R.layout.pds_clip_rectangle_preview, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.clip_badge_content);
        this.c = (ImageView) findViewById(R.id.clip_start_top_icon);
        this.d = (ImageView) findViewById(R.id.clip_end_top_icon);
        this.e = findViewById(R.id.clip_main_icon_container);
        this.f = (ImageView) findViewById(R.id.clip_main_action_icon);
        ClipProgressIndicator clipProgressIndicator = (ClipProgressIndicator) findViewById(R.id.clip_main_action_upload);
        this.g = clipProgressIndicator;
        this.h = (TextView) findViewById(R.id.clip_label_primary);
        this.i = (TextView) findViewById(R.id.clip_label_secondary);
        this.k = (ViewGroup) findViewById(R.id.clip_content_background_container);
        View findViewById = findViewById(R.id.clip_background_content_gradient);
        this.j = findViewById;
        clipProgressIndicator.setResetOnChangeVisibility(false);
        findViewById.setBackground(new heh0());
    }

    public static void b(View view, PreviewItem previewItem, wzs wzsVar) {
        view.setVisibility(previewItem != null ? 0 : 8);
        if (previewItem != null) {
            wzsVar.invoke(previewItem, view);
        }
    }

    public final void a() {
        this.e.setVisibility(this.f.getVisibility() == 0 || this.g.getVisibility() == 0 ? 0 : 8);
    }

    public final PreviewItem.a getBackgroundContent() {
        return this.w;
    }

    public final PreviewItem.b getBadge() {
        return this.p;
    }

    public final double getClipRatio() {
        return this.m;
    }

    public final boolean getEnableBackgroundGradient() {
        return this.o;
    }

    public final boolean getEnableDimmingOverlay() {
        return this.n;
    }

    public final PreviewItem.Icon getEndTopIcon() {
        return this.r;
    }

    public final PreviewItem.c getMainActionUpload() {
        return this.t;
    }

    public final PreviewItem.Icon getMainIcon() {
        return this.s;
    }

    public final PreviewItem.b getPrimaryLabel() {
        return this.u;
    }

    public final PreviewItem.b getSecondaryLabel() {
        return this.v;
    }

    public final PreviewItem.Icon getStartTopIcon() {
        return this.q;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.round(size * this.m), 1073741824));
    }

    public final void setBackgroundContent(PreviewItem.a aVar) {
        this.w = aVar;
        b(this.k, aVar, a.b);
        vut0 vut0Var = this.l;
        if (vut0Var != null) {
            vut0Var.c(aVar != null ? aVar.a : null);
        }
    }

    public final void setBackgroundContentControllerFactory(wut0 wut0Var) {
        ViewGroup viewGroup = this.k;
        viewGroup.removeAllViews();
        vut0 create = wut0Var != null ? wut0Var.create(getContext()) : null;
        this.l = create;
        if (create != null) {
            View view = create.getView();
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(view);
        }
    }

    public final void setBadge(PreviewItem.b bVar) {
        this.p = bVar;
        b(this.b, bVar, b.b);
    }

    public final void setClipRatio(double d2) {
        this.m = d2;
        requestLayout();
    }

    public final void setEnableBackgroundGradient(boolean z) {
        this.o = z;
        this.j.setVisibility(z ? 0 : 8);
    }

    public final void setEnableDimmingOverlay(boolean z) {
        ColorDrawable colorDrawable;
        this.n = z;
        if (z) {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            colorDrawable = new ColorDrawable(context.getColor(R.color.vk_black_alpha35));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            colorDrawable = new ColorDrawable(0);
        }
        this.k.setForeground(colorDrawable);
    }

    public final void setEndTopIcon(PreviewItem.Icon icon) {
        this.r = icon;
        b(this.d, icon, c.b);
    }

    public final void setMainActionUpload(PreviewItem.c cVar) {
        PreviewItem.c cVar2 = this.t;
        boolean z = false;
        if (cVar2 != null && cVar != null && epx.f(cVar2.b, cVar.b) && epx.f(cVar2.c, cVar.c) && epx.f(cVar2.d, cVar.d) && epx.f(cVar2.e, cVar.e) && epx.f(cVar2.f, cVar.f) && epx.f(cVar2.g, cVar.g)) {
            z = true;
        }
        this.t = cVar;
        b(this.g, cVar, new obd(cVar, z));
        a();
    }

    public final void setMainIcon(PreviewItem.Icon icon) {
        this.s = icon;
        b(this.f, icon, d.b);
        a();
    }

    public final void setPrimaryLabel(PreviewItem.b bVar) {
        this.u = bVar;
        b(this.h, bVar, e.b);
    }

    public final void setSecondaryLabel(PreviewItem.b bVar) {
        this.v = bVar;
        b(this.i, bVar, f.b);
    }

    public final void setStartTopIcon(PreviewItem.Icon icon) {
        this.q = icon;
        b(this.c, icon, g.b);
    }

    /* compiled from: ClipRectanglePreview.kt */
    public interface PreviewItem extends rzt0 {

        /* compiled from: ClipRectanglePreview.kt */
        public static final class a implements PreviewItem {
            public final rzt0 a;

            public a(rzt0 rzt0Var) {
                this.a = rzt0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() * 31;
            }

            public final String toString() {
                return "Content(viewParams=" + this.a + ", contentSize=null)";
            }
        }

        /* compiled from: ClipRectanglePreview.kt */
        public static final class b implements PreviewItem {
            public final tlo0.h a;
            public final int b;
            public final cut0 c;
            public final dko d;
            public final cut0 e;

            public b() {
                throw null;
            }

            public b(tlo0.h hVar, int i, cut0 cut0Var, gko gkoVar, x7g x7gVar, int i2) {
                gkoVar = (i2 & 8) != 0 ? null : gkoVar;
                x7gVar = (i2 & 16) != 0 ? null : x7gVar;
                this.a = hVar;
                this.b = i;
                this.c = cut0Var;
                this.d = gkoVar;
                this.e = x7gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                int a = shy.a(this.b, this.a.a.hashCode() * 31, 31);
                cut0 cut0Var = this.c;
                int hashCode = (a + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
                dko dkoVar = this.d;
                int hashCode2 = (hashCode + (dkoVar == null ? 0 : dkoVar.hashCode())) * 31;
                cut0 cut0Var2 = this.e;
                return (hashCode2 + (cut0Var2 != null ? cut0Var2.hashCode() : 0)) * 29791;
            }

            public final String toString() {
                return "Label(text=" + this.a + ", maxLines=" + this.b + ", textColor=" + this.c + ", leadingIcon=" + this.d + ", leadingTintIcon=" + this.e + ", background=null, contentDescription=null, onClickAction=null)";
            }
        }

        /* compiled from: ClipRectanglePreview.kt */
        public static final class c implements PreviewItem {
            public final int a;
            public final gko b;
            public final cut0 c;
            public final cut0 d;
            public final cut0 e;
            public final tlo0 f;
            public final gzs<s3q0> g;

            public c() {
                throw null;
            }

            public c(int i, gko gkoVar, cut0 cut0Var, z7g z7gVar, cut0 cut0Var2, tlo0.f fVar, gzs gzsVar, int i2) {
                z7gVar = (i2 & 8) != 0 ? null : z7gVar;
                fVar = (i2 & 32) != 0 ? null : fVar;
                this.a = i;
                this.b = gkoVar;
                this.c = cut0Var;
                this.d = z7gVar;
                this.e = cut0Var2;
                this.f = fVar;
                this.g = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                gko gkoVar = this.b;
                int hashCode2 = (hashCode + (gkoVar == null ? 0 : Integer.hashCode(gkoVar.a))) * 31;
                cut0 cut0Var = this.c;
                int hashCode3 = (hashCode2 + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
                cut0 cut0Var2 = this.d;
                int hashCode4 = (hashCode3 + (cut0Var2 == null ? 0 : cut0Var2.hashCode())) * 31;
                cut0 cut0Var3 = this.e;
                int hashCode5 = (hashCode4 + (cut0Var3 == null ? 0 : cut0Var3.hashCode())) * 31;
                tlo0 tlo0Var = this.f;
                int hashCode6 = (hashCode5 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.g;
                return hashCode6 + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Uploader(progress=");
                sb.append(this.a);
                sb.append(", icon=");
                sb.append(this.b);
                sb.append(", iconTint=");
                sb.append(this.c);
                sb.append(", backgroundTint=");
                sb.append(this.d);
                sb.append(", indicatorTint=");
                sb.append(this.e);
                sb.append(", contentDescription=");
                sb.append(this.f);
                sb.append(", onClickAction=");
                return uf3.d(sb, this.g, ')');
            }
        }

        /* compiled from: ClipRectanglePreview.kt */
        public static final class Icon implements PreviewItem {
            public final gko a;
            public final ImageView.ScaleType b;
            public final cut0 c;
            public final tlo0 d;
            public final Mode e;
            public final gzs<s3q0> f;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ClipRectanglePreview.kt */
            public static final class Mode {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Mode[] $VALUES;
                public static final Mode ICON;
                public static final Mode ICON_BIG;
                public static final Mode ICON_BUTTON;

                static {
                    Mode mode = new Mode(NativeAdContent.ViewTag.AD_ICON, 0);
                    ICON = mode;
                    Mode mode2 = new Mode("ICON_BUTTON", 1);
                    ICON_BUTTON = mode2;
                    Mode mode3 = new Mode("ICON_BIG", 2);
                    ICON_BIG = mode3;
                    Mode[] modeArr = {mode, mode2, mode3};
                    $VALUES = modeArr;
                    $ENTRIES = new asp(modeArr);
                }

                public Mode() {
                    throw null;
                }

                public static Mode valueOf(String str) {
                    return (Mode) Enum.valueOf(Mode.class, str);
                }

                public static Mode[] values() {
                    return (Mode[]) $VALUES.clone();
                }
            }

            public Icon(gko gkoVar, ImageView.ScaleType scaleType, cut0 cut0Var, tlo0.f fVar, Mode mode, k14 k14Var) {
                this.a = gkoVar;
                this.b = scaleType;
                this.c = cut0Var;
                this.d = fVar;
                this.e = mode;
                this.f = k14Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return epx.f(this.a, icon.a) && this.b == icon.b && epx.f(this.c, icon.c) && epx.f(this.d, icon.d) && this.e == icon.e && epx.f(this.f, icon.f);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a.a) * 31;
                ImageView.ScaleType scaleType = this.b;
                int hashCode2 = (hashCode + (scaleType == null ? 0 : scaleType.hashCode())) * 31;
                cut0 cut0Var = this.c;
                int hashCode3 = (hashCode2 + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
                tlo0 tlo0Var = this.d;
                int hashCode4 = (this.e.hashCode() + ((hashCode3 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31)) * 31;
                gzs<s3q0> gzsVar = this.f;
                return hashCode4 + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(icon=");
                sb.append(this.a);
                sb.append(", scaleType=");
                sb.append(this.b);
                sb.append(", tintColor=");
                sb.append(this.c);
                sb.append(", contentDescription=");
                sb.append(this.d);
                sb.append(", mode=");
                sb.append(this.e);
                sb.append(", onClickAction=");
                return uf3.d(sb, this.f, ')');
            }

            public /* synthetic */ Icon(gko gkoVar, cut0 cut0Var, Mode mode, int i) {
                this(gkoVar, (i & 2) != 0 ? null : ImageView.ScaleType.CENTER, cut0Var, null, (i & 16) != 0 ? Mode.ICON : mode, null);
            }
        }
    }
}
