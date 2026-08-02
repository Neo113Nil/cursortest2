package com.vk.im.design.view.pagination.pin;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.awt0;
import xsna.bc;
import xsna.bcr0;
import xsna.bwt0;
import xsna.f4m;
import xsna.gzs;
import xsna.hny;
import xsna.iah0;
import xsna.m9b;
import xsna.rlw;
import xsna.rq90;
import xsna.s3q0;
import xsna.slw;
import xsna.tlo0;
import xsna.ulw;
import xsna.vfz;
import xsna.vlw;

/* compiled from: AttachPinViewHolder.kt */
/* loaded from: classes2.dex */
public final class a extends vfz<ImPinItem.WithAttach> {
    public final gzs<s3q0> l;
    public final VKImageController<ImageView> m;
    public final TextView n;
    public final TextView o;
    public final View p;
    public final ImageView q;
    public final View r;

    /* compiled from: AttachPinViewHolder.kt */
    /* renamed from: com.vk.im.design.view.pagination.pin.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1100a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImPinItem.WithAttach.Style.values().length];
            try {
                iArr[ImPinItem.WithAttach.Style.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImPinItem.WithAttach.Style.Rounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImPinItem.WithAttach.Style.Stencil.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(m9b m9bVar, bcr0 bcr0Var, ViewGroup viewGroup) {
        super(R.layout.im_ui_internal_pin_with_attach_view_item, viewGroup);
        this.l = m9bVar;
        VKImageController<ImageView> create = bcr0Var.create(this.itemView.getContext());
        this.m = create;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.left_container);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.p = this.itemView.findViewById(R.id.stack_item);
        this.q = (ImageView) this.itemView.findViewById(R.id.overlay);
        this.r = this.itemView.findViewById(R.id.player_icon);
        frameLayout.addView((ImageView) ((com.vk.core.ui.image.c) create).getView(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
        this.itemView.setOnClickListener(new bc(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0181  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(ImPinItem.WithAttach withAttach) {
        float f;
        VKImageController.b bVar;
        VKImageController.b bVar2;
        float f2;
        ImPinItem.WithAttach withAttach2 = withAttach;
        boolean z = withAttach2.f;
        ImPinItem.WithAttach.a aVar = withAttach2.c;
        boolean z2 = aVar.c;
        ImPinItem.WithAttach.Style style = aVar.b;
        VKImageController<ImageView> vKImageController = this.m;
        vKImageController.clear();
        ImPinItem.WithAttach.b bVar3 = withAttach2.g;
        if (bVar3 != null) {
            bVar3.a.invoke(vKImageController.getView());
            bwt0.d(vKImageController.getView(), iah0.b(10.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            rlw rlwVar = aVar.a;
            String str = aVar.d;
            int i = C1100a.$EnumSwitchMapping$0[style.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    bVar2 = new VKImageController.b(10.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int a = iah0.a(z ? 30 : 40);
                    Path path = null;
                    if (str != null) {
                        try {
                            Path d = rq90.d(str);
                            RectF rectF = new RectF();
                            d.computeBounds(rectF, true);
                            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            try {
                                float max = Math.max(rectF.width(), rectF.height());
                                if (max > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float f3 = a / max;
                                    Matrix matrix = new Matrix();
                                    matrix.postScale(f3, f3);
                                    d.transform(matrix);
                                    path = d;
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                        bVar2 = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, path, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                    }
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    bVar2 = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, path, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                }
                bVar = bVar2;
            } else {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                bVar = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65531);
            }
            if (rlwVar instanceof slw) {
                vKImageController.a(((slw) rlwVar).a, bVar);
            } else if (rlwVar instanceof ulw) {
                vKImageController.j(((ulw) rlwVar).a, bVar);
            } else {
                if (!(rlwVar instanceof vlw)) {
                    throw new NoWhenBranchMatchedException();
                }
                vKImageController.f(((vlw) rlwVar).a, bVar);
            }
        }
        ImageView imageView = this.q;
        awt0.v(imageView, z2);
        hny hnyVar = new hny(this.itemView.getContext());
        int i2 = C1100a.$EnumSwitchMapping$0[style.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 10.0f;
                hnyVar.c(iah0.b(f2), R.attr.vk_ui_overlay_primary);
                imageView.setImageDrawable(hnyVar);
                awt0.v(this.r, z2);
                awt0.v(this.p, z);
                if (z) {
                    ImageView view = vKImageController.getView();
                    float f4 = 40;
                    f4m.C(iah0.a(f4), view);
                    f4m.k(iah0.a(f4), view);
                    view.setRotation(f);
                } else {
                    ImageView view2 = vKImageController.getView();
                    float f5 = 30;
                    f4m.C(iah0.a(f5), view2);
                    f4m.k(iah0.a(f5), view2);
                    view2.setRotation(-8.0f);
                }
                this.n.setText(tlo0.b.a(withAttach2.d, this.itemView.getContext()));
                this.o.setText(tlo0.b.a(withAttach2.e, this.itemView.getContext()));
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        f2 = 100.0f;
        hnyVar.c(iah0.b(f2), R.attr.vk_ui_overlay_primary);
        imageView.setImageDrawable(hnyVar);
        awt0.v(this.r, z2);
        awt0.v(this.p, z);
        if (z) {
        }
        this.n.setText(tlo0.b.a(withAttach2.d, this.itemView.getContext()));
        this.o.setText(tlo0.b.a(withAttach2.e, this.itemView.getContext()));
    }
}
