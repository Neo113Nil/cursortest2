package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel;

import Sc.o;
import Tc.b;
import WZ.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelConstants;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemVO;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomHolderKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.SocialSoundControlDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteItemOptimized;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001)B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\"\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R$\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "newItems", "", "updateItems", "(Ljava/util/List;)V", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder;", "createHolder", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder;", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "", "onMuteClicked", "init", "(LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "items", "hasAudio", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "muteItem", "", "widgetId", "bind", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;J)V", "", "holders", "Ljava/util/List;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "RightPanelItemHolder", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RightPanelWithMuteLayout extends LinearLayout {

    @NotNull
    private final List<RightPanelItemHolder> holders;
    private Function1<? super AtomAction, Unit> onAction;
    private Function1<? super Boolean, Unit> onMuteClicked;
    private l tokenizedAnalytics;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "isLast", "", "canBind", "IconHolder", "TextHolder", "MuteHolder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder$IconHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder$MuteHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder$TextHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class RightPanelItemHolder {

        @NotNull
        private final View view;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder$IconHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelItemView;", "iconView", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelItemView;LWZ/l;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "item", "", "isLast", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;Z)V", "canBind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;)Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelItemView;", "LWZ/l;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconHolder extends RightPanelItemHolder {

            @NotNull
            private final RightPanelItemView iconView;

            @NotNull
            private final l tokenizedAnalytics;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconHolder(@NotNull RightPanelItemView iconView, @NotNull l tokenizedAnalytics) {
                super(iconView, null);
                Intrinsics.checkNotNullParameter(iconView, "iconView");
                Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
                this.iconView = iconView;
                this.tokenizedAnalytics = tokenizedAnalytics;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout.RightPanelItemHolder
            public void bind(@NotNull RightPanelWithMuteItemOptimized item, boolean isLast) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof RightPanelWithMuteItemOptimized.IconItem) {
                    RightPanelWithMuteItemOptimized.IconItem iconItem = (RightPanelWithMuteItemOptimized.IconItem) item;
                    this.iconView.bind(iconItem.getItem(), iconItem.getHasText(), isLast, this.tokenizedAnalytics);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout.RightPanelItemHolder
            public boolean canBind(@NotNull RightPanelWithMuteItemOptimized item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof RightPanelWithMuteItemOptimized.IconItem;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder$MuteHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder;", "muteView", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView;", "onMuteClicked", "Lkotlin/Function1;", "", "", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "isLast", "canBind", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MuteHolder extends RightPanelItemHolder {

            @NotNull
            private final RightPanelMuteItemView muteView;

            @NotNull
            private final Function1<Boolean, Unit> onMuteClicked;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public MuteHolder(@NotNull RightPanelMuteItemView muteView, @NotNull Function1<? super Boolean, Unit> onMuteClicked) {
                super(muteView, null);
                Intrinsics.checkNotNullParameter(muteView, "muteView");
                Intrinsics.checkNotNullParameter(onMuteClicked, "onMuteClicked");
                this.muteView = muteView;
                this.onMuteClicked = onMuteClicked;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout.RightPanelItemHolder
            public void bind(@NotNull RightPanelWithMuteItemOptimized item, boolean isLast) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof RightPanelWithMuteItemOptimized.MuteItem) {
                    this.muteView.bind((RightPanelWithMuteItemOptimized.MuteItem) item, this.onMuteClicked);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout.RightPanelItemHolder
            public boolean canBind(@NotNull RightPanelWithMuteItemOptimized item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof RightPanelWithMuteItemOptimized.MuteItem;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder$TextHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteLayout$RightPanelItemHolder;", "textView", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized;", "isLast", "", "canBind", "updateBottomPadding", "view", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TextHolder extends RightPanelItemHolder {

            @NotNull
            private final Function1<AtomAction, Unit> onAction;

            @NotNull
            private final SocialTextAtomView textView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TextHolder(@NotNull SocialTextAtomView textView, @NotNull Function1<? super AtomAction, Unit> onAction) {
                super(textView, null);
                Intrinsics.checkNotNullParameter(textView, "textView");
                Intrinsics.checkNotNullParameter(onAction, "onAction");
                this.textView = textView;
                this.onAction = onAction;
            }

            private final void updateBottomPadding(SocialTextAtomView view, boolean isLast) {
                ViewExtKt.updatePadding$default(view, 0, 0, 0, isLast ? 0 : RightPanelConstants.INSTANCE.getBOTTOM_PADDING_WITH_TEXT(), 7, null);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout.RightPanelItemHolder
            public void bind(@NotNull RightPanelWithMuteItemOptimized item, boolean isLast) {
                String automatizationId;
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof RightPanelWithMuteItemOptimized.TextItem) {
                    SocialTextAtomDTO text = ((RightPanelWithMuteItemOptimized.TextItem) item).getItem().getText();
                    if (text != null) {
                        SocialTextAtomHolderKt.bind$default(this.textView, text, null, 2, null);
                        TestInfo testInfo = text.getTestInfo();
                        if (testInfo != null && (automatizationId = testInfo.getAutomatizationId()) != null) {
                            this.textView.setContentDescription(automatizationId);
                        }
                        ViewExtKt.setOnClickListenerThrottle(this.textView, 800L, new RightPanelWithMuteLayout$RightPanelItemHolder$TextHolder$bind$1$2(this, item));
                    }
                    updateBottomPadding(this.textView, isLast);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteLayout.RightPanelItemHolder
            public boolean canBind(@NotNull RightPanelWithMuteItemOptimized item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof RightPanelWithMuteItemOptimized.TextItem;
            }
        }

        public /* synthetic */ RightPanelItemHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        public abstract void bind(@NotNull RightPanelWithMuteItemOptimized item, boolean isLast);

        public abstract boolean canBind(@NotNull RightPanelWithMuteItemOptimized item);

        @NotNull
        public final View getView() {
            return this.view;
        }

        private RightPanelItemHolder(View view) {
            this.view = view;
        }
    }

    public /* synthetic */ RightPanelWithMuteLayout(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final RightPanelItemHolder createHolder(RightPanelWithMuteItemOptimized item) {
        if (item instanceof RightPanelWithMuteItemOptimized.IconItem) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Function1<? super AtomAction, Unit> function1 = this.onAction;
            if (function1 == null) {
                return null;
            }
            RightPanelItemView rightPanelItemView = new RightPanelItemView(context, function1);
            l lVar = this.tokenizedAnalytics;
            if (lVar == null) {
                return null;
            }
            return new RightPanelItemHolder.IconHolder(rightPanelItemView, lVar);
        }
        if (item instanceof RightPanelWithMuteItemOptimized.TextItem) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            SocialTextAtomView socialTextAtomView = new SocialTextAtomView(context2, null, 0, 6, null);
            Dimens dimens = Dimens.INSTANCE;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimens.getDP_56(), -2);
            layoutParams.topMargin = dimens.getDP_4();
            socialTextAtomView.setLayoutParams(layoutParams);
            socialTextAtomView.setGravity(1);
            Function1<? super AtomAction, Unit> function12 = this.onAction;
            if (function12 == null) {
                return null;
            }
            return new RightPanelItemHolder.TextHolder(socialTextAtomView, function12);
        }
        if (!(item instanceof RightPanelWithMuteItemOptimized.MuteItem)) {
            throw new o();
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        l lVar2 = this.tokenizedAnalytics;
        if (lVar2 == null) {
            return null;
        }
        RightPanelMuteItemView rightPanelMuteItemView = new RightPanelMuteItemView(context3, lVar2);
        Function1<? super Boolean, Unit> function13 = this.onMuteClicked;
        if (function13 == null) {
            return null;
        }
        return new RightPanelItemHolder.MuteHolder(rightPanelMuteItemView, function13);
    }

    private final void updateItems(List<? extends RightPanelWithMuteItemOptimized> newItems) {
        View view;
        while (this.holders.size() > newItems.size()) {
            RightPanelItemHolder rightPanelItemHolder = (RightPanelItemHolder) C7714v.x0(this.holders);
            if (rightPanelItemHolder != null && (view = rightPanelItemHolder.getView()) != null) {
                removeView(view);
            }
        }
        int i11 = 0;
        for (Object obj : newItems) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            RightPanelWithMuteItemOptimized rightPanelWithMuteItemOptimized = (RightPanelWithMuteItemOptimized) obj;
            boolean z11 = i11 == C7714v.P(newItems);
            if (i11 < this.holders.size()) {
                RightPanelItemHolder rightPanelItemHolder2 = this.holders.get(i11);
                if (rightPanelItemHolder2.canBind(rightPanelWithMuteItemOptimized)) {
                    rightPanelItemHolder2.bind(rightPanelWithMuteItemOptimized, z11);
                } else {
                    removeView(rightPanelItemHolder2.getView());
                    RightPanelItemHolder createHolder = createHolder(rightPanelWithMuteItemOptimized);
                    if (createHolder != null) {
                        this.holders.set(i11, createHolder);
                        addView(createHolder.getView(), i11);
                        createHolder.bind(rightPanelWithMuteItemOptimized, z11);
                    }
                }
            } else {
                RightPanelItemHolder createHolder2 = createHolder(rightPanelWithMuteItemOptimized);
                if (createHolder2 != null) {
                    this.holders.add(createHolder2);
                    addView(createHolder2.getView(), i11);
                    createHolder2.bind(rightPanelWithMuteItemOptimized, z11);
                }
            }
            i11 = i12;
        }
    }

    public final void bind(@NotNull List<RightPanelItemVO> items, Boolean hasAudio, SocialSoundControlDTO muteItem, long widgetId) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (TokensExtKt.getIconResByToken(context, ((RightPanelItemVO) obj).getIcon().getImage()) != null) {
                arrayList.add(obj);
            }
        }
        b builder = C7714v.B();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RightPanelItemVO rightPanelItemVO = (RightPanelItemVO) it.next();
            boolean z11 = rightPanelItemVO.getText() != null;
            builder.add(new RightPanelWithMuteItemOptimized.IconItem(rightPanelItemVO, z11));
            if (z11) {
                builder.add(new RightPanelWithMuteItemOptimized.TextItem(rightPanelItemVO));
            }
        }
        if (muteItem != null) {
            builder.add(new RightPanelWithMuteItemOptimized.MuteItem(muteItem, hasAudio, !arrayList.isEmpty(), widgetId));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        updateItems(builder.B());
    }

    public final void init(@NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super Boolean, Unit> onMuteClicked) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onMuteClicked, "onMuteClicked");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAction = onAction;
        this.onMuteClicked = onMuteClicked;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightPanelWithMuteLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.holders = new ArrayList();
        setOrientation(1);
    }
}
