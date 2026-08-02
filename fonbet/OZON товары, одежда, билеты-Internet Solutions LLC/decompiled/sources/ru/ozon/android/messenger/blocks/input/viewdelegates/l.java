package ru.ozon.android.messenger.blocks.input.viewdelegates;

import Az.ViewOnClickListenerC2453a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.input.c;
import ru.ozon.android.messenger.blocks.input.viewmodel.o;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.databinding.MViewChatInputCustomBlockBinding;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.h f85593a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85594b;

    /* renamed from: c, reason: collision with root package name */
    private MViewChatInputCustomBlockBinding f85595c;

    public l(@NotNull ru.ozon.android.messenger.blocks.input.viewmodel.h chatInputViewModel, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        Intrinsics.checkNotNullParameter(chatInputViewModel, "chatInputViewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85593a = chatInputViewModel;
        this.f85594b = references;
    }

    public static void a(IconButtonV3DTO iconButtonV3DTO, l lVar) {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        lVar.f85594b.c().m(ru.ozon.android.messenger.framework.analytics.h.a((iconButtonV3DTO == null || (common2 = iconButtonV3DTO.getCommon()) == null) ? null : common2.getTrackingInfo()));
        lVar.f85593a.H0();
        ru.ozon.android.messenger.framework.core.d dVar = lVar.f85594b;
        dVar.c().v(c.a.f85507a);
        if (iconButtonV3DTO == null || (common = iconButtonV3DTO.getCommon()) == null || (action = common.getAction()) == null) {
            return;
        }
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(action));
    }

    public static final void b(l lVar, o oVar) {
        if (oVar == null) {
            lVar.getClass();
            return;
        }
        MViewChatInputCustomBlockBinding mViewChatInputCustomBlockBinding = lVar.f85595c;
        if (mViewChatInputCustomBlockBinding != null) {
            if (oVar.f() == null) {
                ConstraintLayout constraintLayout = mViewChatInputCustomBlockBinding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                s.a(constraintLayout);
                return;
            }
            ConstraintLayout constraintLayout2 = mViewChatInputCustomBlockBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            s.d(constraintLayout2);
            if (oVar.f() != null) {
                Context context = mViewChatInputCustomBlockBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i11 = ru.ozon.android.messenger.utils.h.b(context) ? R$dimen.dimen_32 : R$dimen.dimen_16;
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = mViewChatInputCustomBlockBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context2, oVar.f().getBackgroundColor());
                if (parseColor != null) {
                    int intValue = parseColor.intValue();
                    ConstraintLayout constraintLayout3 = mViewChatInputCustomBlockBinding.getConstraintLayout();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(intValue);
                    Context context3 = mViewChatInputCustomBlockBinding.getConstraintLayout().getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    Intrinsics.checkNotNullParameter(context3, "<this>");
                    gradientDrawable.setCornerRadius(context3.getResources().getDimension(i11));
                    constraintLayout3.setBackground(gradientDrawable);
                }
            }
            Unit unit = Unit.f71690a;
            if (oVar.f() != null) {
                TextDTO subtitle = oVar.f().getSubtitle();
                d.a f7 = ru.ozon.android.messenger.utils.g.f(lVar.f85594b.d());
                if (subtitle == null) {
                    ConstraintLayout constraintLayout4 = mViewChatInputCustomBlockBinding.getConstraintLayout();
                    androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout4, "getRoot(...)", constraintLayout4);
                    int id2 = mViewChatInputCustomBlockBinding.customBlockTitle.getId();
                    Context context4 = mViewChatInputCustomBlockBinding.getConstraintLayout().getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    int a11 = ru.ozon.android.messenger.utils.h.a(context4, R$dimen.dimen_6);
                    Intrinsics.checkNotNullParameter(d11, "<this>");
                    d11.t(id2, 4, 0, 4, a11);
                    d11.f(constraintLayout4);
                }
                TextAtomV2View customBlockTitle = mViewChatInputCustomBlockBinding.customBlockTitle;
                Intrinsics.checkNotNullExpressionValue(customBlockTitle, "customBlockTitle");
                TextHolderKt.bind$default(customBlockTitle, oVar.f().getTitle(), null, 2, null);
                mViewChatInputCustomBlockBinding.labeledIcon.b(ru.ozon.android.messenger.utils.view.f.a(oVar.f().getLabeledIcon()), f7);
                TextAtomV2View customBlockSubtitle = mViewChatInputCustomBlockBinding.customBlockSubtitle;
                Intrinsics.checkNotNullExpressionValue(customBlockSubtitle, "customBlockSubtitle");
                TextHolderKt.bindOrGone$default(customBlockSubtitle, subtitle, null, 2, null);
            }
            if (oVar.f() != null) {
                IconDTO image = oVar.f().getImage();
                IconView customBlockIcon = mViewChatInputCustomBlockBinding.customBlockIcon;
                Intrinsics.checkNotNullExpressionValue(customBlockIcon, "customBlockIcon");
                IconHolderKt.bindOrGone$default(customBlockIcon, image, null, 2, null);
            }
            if (!kotlin.text.h.K(oVar.l().b())) {
                IconButtonV3View removeIcon = mViewChatInputCustomBlockBinding.removeIcon;
                Intrinsics.checkNotNullExpressionValue(removeIcon, "removeIcon");
                s.a(removeIcon);
            } else {
                CustomBlockDTO f11 = oVar.f();
                IconButtonV3DTO removeIcon2 = f11 != null ? f11.getRemoveIcon() : null;
                IconButtonV3View removeIcon3 = mViewChatInputCustomBlockBinding.removeIcon;
                Intrinsics.checkNotNullExpressionValue(removeIcon3, "removeIcon");
                IconButtonV3HolderKt.bindOrGone$default(removeIcon3, removeIcon2, null, 2, null);
                mViewChatInputCustomBlockBinding.removeIcon.setOnClickListener(new ViewOnClickListenerC2453a(7, removeIcon2, lVar));
            }
        }
    }

    public final void d(@NotNull ViewGroup parent, @NotNull ru.ozon.android.messenger.blocks.input.d viewObject) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MViewChatInputCustomBlockBinding inflate = MViewChatInputCustomBlockBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
        parent.addView(inflate.getConstraintLayout());
        ConstraintLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        s.e(constraintLayout, Boolean.valueOf(viewObject.f() != null));
        this.f85595c = inflate;
    }

    public final void e(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MViewChatInputCustomBlockBinding mViewChatInputCustomBlockBinding = this.f85595c;
        parent.removeView(mViewChatInputCustomBlockBinding != null ? mViewChatInputCustomBlockBinding.getConstraintLayout() : null);
        this.f85595c = null;
    }
}
