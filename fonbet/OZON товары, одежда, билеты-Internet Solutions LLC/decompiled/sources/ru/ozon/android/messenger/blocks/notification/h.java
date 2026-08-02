package ru.ozon.android.messenger.blocks.notification;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.notification.b;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadge;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MBlockNotificationBinding;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.badge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

/* loaded from: classes10.dex */
public final class h extends q<b, MBlockNotificationBinding> {

    /* renamed from: f, reason: collision with root package name */
    private static final int f85918f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f85919g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f85920h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f85921i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f85922j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f85923k;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85924a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85925b;

    /* renamed from: c, reason: collision with root package name */
    private final int f85926c;

    /* renamed from: d, reason: collision with root package name */
    private final int f85927d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f85928e;

    static final class a extends AbstractC7737t implements Function0<Drawable> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() {
            h hVar = h.this;
            return androidx.core.content.res.g.d(hVar.getContext().getResources(), R$drawable.m_fg_notification_image_blur, hVar.getContext().getTheme());
        }
    }

    static {
        int i11;
        int i12;
        i11 = ru.ozon.android.messenger.utils.e.f91906c;
        f85918f = i11;
        f85919g = i11;
        i12 = ru.ozon.android.messenger.utils.e.f91908e;
        f85920h = i12;
        f85921i = i11;
        f85922j = i12;
        f85923k = ru.ozon.android.messenger.utils.h.c(55);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull MBlockNotificationBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85924a = references;
        this.f85925b = ru.ozon.android.messenger.utils.h.a(getContext(), R$dimen.m_msg_bg_large_corner_radius);
        this.f85926c = ru.ozon.android.messenger.utils.h.a(getContext(), R$dimen.m_image_max_height);
        this.f85927d = (int) (references.e().getWidth() * 0.8d);
        this.f85928e = ru.ozon.android.messenger.utils.f.b(new a());
    }

    public static void b(h hVar, AtomAction atomAction) {
        hVar.f85924a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction, null, 3));
    }

    public static final void e(h hVar, AtomAction atomAction) {
        hVar.f85924a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction, null, 3));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [Sc.j, java.lang.Object] */
    public static final void f(h hVar, Bitmap bitmap) {
        ImageView imageView = hVar.getBinding().blurIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, bitmap, null, C7714v.a0(new ImageTransformation.Blur(f85923k, 1)), null, 10, null);
        imageView.setBackgroundResource(R$drawable.m_bg_notification_image_blur);
        imageView.setForeground((Drawable) hVar.f85928e.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        SmallButtonView smallButtonView;
        Bitmap bitmap;
        b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (!(itemInfo instanceof s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AtomAction a11 = block.a();
        if (a11 != null) {
            getBinding().getConstraintLayout().setOnClickListener(new GD.b(6, this, a11));
        }
        b.a e11 = block.e();
        MBlockNotificationBinding binding = getBinding();
        ru.ozon.android.messenger.framework.core.d dVar = this.f85924a;
        int i11 = 0;
        if (itemInfo == null || e11 == null || kotlin.text.h.K(e11.b())) {
            ImageView imageIv = binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
            ru.ozon.android.messenger.utils.view.s.a(imageIv);
        } else {
            ImageView imageIv2 = binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv2, "imageIv");
            ru.ozon.android.messenger.utils.view.s.d(imageIv2);
            getBinding().getConstraintLayout().setOutlineProvider(new g(this));
            getBinding().getConstraintLayout().setClipToOutline(true);
            Integer c11 = e11.c();
            Integer a12 = e11.a();
            int i12 = this.f85926c;
            int i13 = this.f85927d;
            ImageSize a13 = (c11 == null || a12 == null) ? null : ru.ozon.android.messenger.utils.image.e.a(new ImageSize(ru.ozon.android.messenger.utils.h.c(c11.intValue()), ru.ozon.android.messenger.utils.h.c(a12.intValue())), i13, i12);
            ImageView imageIv3 = binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv3, "imageIv");
            Context context = imageIv3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i14 = R$drawable.m_notification_image_placeholder;
            if (a13 != null) {
                i13 = a13.getWidth();
            }
            if (a13 != null) {
                i12 = a13.getHeight();
            }
            Intrinsics.checkNotNullParameter(context, "<this>");
            Drawable drawable = androidx.core.content.a.getDrawable(context, i14);
            if (drawable != null) {
                Canvas canvas = new Canvas();
                bitmap = Bitmap.createBitmap(i13, i12, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
                canvas.setBitmap(bitmap);
                drawable.setBounds(0, 0, i13, i12);
                drawable.draw(canvas);
            } else {
                bitmap = null;
            }
            imageIv3.setImageBitmap(bitmap);
            d.a f7 = ru.ozon.android.messenger.utils.g.f(dVar.d());
            ContextExtKt.loadAsBitmap$default(getContext(), n.b(e11.b(), f7.a(), f7.b()), null, a13, null, new f(this, binding), 10, null);
        }
        MBlockNotificationBinding binding2 = getBinding();
        binding2.badgesFbl.removeAllViews();
        TimerBadge f11 = block.f();
        int i15 = f85920h;
        int i16 = f85919g;
        if (f11 != null) {
            DateTime expirationDate = f11.getExpirationDate();
            expirationDate.getClass();
            int i17 = org.joda.time.c.f79052b;
            if (expirationDate.getMillis() >= System.currentTimeMillis()) {
                ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.d dVar2 = new ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.d(getContext());
                dVar2.bind(f11);
                ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.f containerView = dVar2.getContainerView();
                FlexboxLayout.a aVar = new FlexboxLayout.a(-2, -2);
                aVar.setMargins(((ViewGroup.MarginLayoutParams) aVar).leftMargin, ((ViewGroup.MarginLayoutParams) aVar).topMargin, i16, i15);
                containerView.setLayoutParams(aVar);
                binding2.badgesFbl.addView(dVar2.getContainerView());
            }
        }
        List<Badge> b11 = block.b();
        if (b11 != null) {
            for (Badge badge : b11) {
                BadgeView badgeView = new BadgeView(getContext(), null, 0, 6, null);
                Badge.StyleType theme = badge.getTheme();
                if (theme == null) {
                    theme = Badge.StyleType.STYLE_TYPE_SMALL;
                }
                BadgeHolderKt.bind(badgeView, Badge.copy$default(badge, null, null, null, null, null, null, null, theme, null, null, null, null, null, 8063, null), new c(this));
                FlexboxLayout.a aVar2 = new FlexboxLayout.a(-2, -2);
                aVar2.setMargins(((ViewGroup.MarginLayoutParams) aVar2).leftMargin, ((ViewGroup.MarginLayoutParams) aVar2).topMargin, i16, i15);
                badgeView.setLayoutParams(aVar2);
                binding2.badgesFbl.addView(badgeView);
            }
            Unit unit = Unit.f71690a;
        }
        MBlockNotificationBinding binding3 = getBinding();
        binding3.contentLl.removeAllViews();
        List<TextAtom> d11 = block.d();
        if (d11 != null) {
            for (Object obj2 : d11) {
                int i18 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                TextAtomView textAtomView = new TextAtomView(getContext(), null, 0, 6, null);
                TextAtomHolderKt.bind$default(textAtomView, (TextAtom) obj2, null, 2, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i11 != C7714v.P(block.d())) {
                    layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, f85918f);
                }
                textAtomView.setLayoutParams(layoutParams);
                binding3.contentLl.addView(textAtomView);
                i11 = i18;
            }
            Unit unit2 = Unit.f71690a;
        }
        MBlockNotificationBinding binding4 = getBinding();
        FlexboxLayout.a aVar3 = new FlexboxLayout.a(-2, -2);
        aVar3.setMargins(((ViewGroup.MarginLayoutParams) aVar3).leftMargin, ((ViewGroup.MarginLayoutParams) aVar3).topMargin, f85921i, f85922j);
        binding4.buttonsFbl.removeAllViews();
        List<ButtonV3Atom> c12 = block.c();
        if (c12 != null) {
            for (ButtonV3Atom buttonV3Atom : c12) {
                if (buttonV3Atom instanceof ButtonV3Atom.SmallBorderlessButton) {
                    SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(getContext(), null, 0, 6, null);
                    WrappedBorderlessButtonHolderKt.bind(smallBorderlessButtonView, (ButtonV3Atom.SmallBorderlessButton) buttonV3Atom, new d(this));
                    smallBorderlessButtonView.setLayoutParams(aVar3);
                    smallButtonView = smallBorderlessButtonView;
                } else if (buttonV3Atom instanceof ButtonV3Atom.SmallButton) {
                    SmallButtonView smallButtonView2 = new SmallButtonView(getContext(), null, 0, 6, null);
                    WrappedButtonHolderKt.bind(smallButtonView2, (ButtonV3Atom.SmallButton) buttonV3Atom, new e(this));
                    smallButtonView2.setLayoutParams(aVar3);
                    smallButtonView = smallButtonView2;
                } else {
                    smallButtonView = null;
                }
                if (smallButtonView != null) {
                    binding4.buttonsFbl.addView(smallButtonView);
                }
            }
            Unit unit3 = Unit.f71690a;
        }
        TextView sendTimeTv = getBinding().sendTimeTv;
        Intrinsics.checkNotNullExpressionValue(sendTimeTv, "sendTimeTv");
        ru.ozon.android.messenger.blocks.common.a.b(sendTimeTv, block.getSendTime(), (s) itemInfo);
        Map<String, MessengerTrackingInfo> g10 = block.g();
        if (g10 == null) {
            return;
        }
        dVar.c().s(g10);
    }
}
