package ru.ozon.uni.atoms.v3.holders.cell;

import Sc.InterfaceC4008j;
import Sc.k;
import VD.a;
import Ve.ViewOnClickListenerC4465n7;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.helper.widget.Flow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.util.movement.LinkOnlyMovementMethod;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.RadioButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001UB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u0018J\u001d\u0010\u0014\u001a\u00020\u000e*\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u000e*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u000e*\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\u00020\u000e*\u00020&2\b\u0010#\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b$\u0010(J)\u0010-\u001a\u00020\u000e*\u00020)2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00101\u001a\u000200*\u00020/H\u0002¢\u0006\u0004\b1\u00102J*\u00105\u001a\u0002042\b\u0010\u0013\u001a\u0004\u0018\u000103H\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b5\u00106J%\u0010:\u001a\u000209*\u0004\u0018\u0001072\u0006\u0010\n\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u000209*\u0004\u0018\u0001072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b<\u0010=J#\u0010$\u001a\u00020\u000e*\u00020>2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0002¢\u0006\u0004\b$\u0010BJ\u001b\u0010\u0014\u001a\u00020\u000e*\u00020C2\u0006\u0010#\u001a\u00020DH\u0002¢\u0006\u0004\b\u0014\u0010EJ\u001d\u0010$\u001a\u00020\u000e*\u00020C2\b\u0010#\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\b$\u0010EJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0002H\u0014¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010T\u001a\u000204*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/cell/CellHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/android/cell/CellView;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/cell/CellView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "cellSettings", "", "bindSettings", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;)V", "Lru/ozon/uni/android/cell/CellView$LeftBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "blockDto", "bind", "(Lru/ozon/uni/android/cell/CellView$LeftBlock;Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;)V", "Lru/ozon/uni/android/cell/CellView$CenterBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;", "(Lru/ozon/uni/android/cell/CellView$CenterBlock;Lru/ozon/uni/atoms/data/dsCell/CellDTO$CenterBlock;)V", "Lru/ozon/uni/android/cell/CellView$RightBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;", "(Lru/ozon/uni/android/cell/CellView$RightBlock;Lru/ozon/uni/atoms/data/dsCell/CellDTO$RightBlock;)V", "Lru/ozon/uni/android/cell/CellView$AddonBlock;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$AddonBlockDTO;", "commonAddonSettings", "bindCommonAddonSettings", "(Lru/ozon/uni/android/cell/CellView$AddonBlock;Lru/ozon/uni/atoms/data/dsCell/CellDTO$AddonBlockDTO;)V", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "dto", "bindOrGone", "(Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "(Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "handeAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "toTitleIconDto", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$ContainerBlockDTO;", "", "blockDtoIsNullOrEmpty", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO$ContainerBlockDTO;)Z", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "default", "", "toPxOrDefault", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Landroid/content/Context;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "toPxOrNone", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Landroid/content/Context;)I", "Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "(Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;Ljava/util/List;)V", "Lru/ozon/uni/android/cell/CellView$TextView;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "(Lru/ozon/uni/android/cell/CellView$TextView;Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;)V", "item", "onBind", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "testId", "setTestId", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/v3/holders/cell/CellHolder$FlowBadgeListViewHolder;", "badgeListHolder$delegate", "LSc/j;", "getBadgeListHolder", "()Lru/ozon/uni/atoms/v3/holders/cell/CellHolder$FlowBadgeListViewHolder;", "badgeListHolder", "getHasAction", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Z", "hasAction", "FlowBadgeListViewHolder", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHolder extends AtomV3<CellDTO, CellView> {

    /* renamed from: badgeListHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeListHolder;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\b0\b0\u0013j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/cell/CellHolder$FlowBadgeListViewHolder;", "", "Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "containerView", "<init>", "(Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;)V", "Landroidx/constraintlayout/helper/widget/Flow;", "", "Landroid/view/View;", "referencedViews", "(Landroidx/constraintlayout/helper/widget/Flow;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "bind", "(Ljava/util/List;)V", "Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "getContainerView", "()Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "childViews", "Ljava/util/ArrayList;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FlowBadgeListViewHolder {

        @NotNull
        private final ArrayList<View> childViews;

        @NotNull
        private final CellView.FlowBadgeListView containerView;

        public FlowBadgeListViewHolder(@NotNull CellView.FlowBadgeListView containerView) {
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.containerView = containerView;
            this.childViews = new ArrayList<>(referencedViews(containerView));
        }

        private final List<View> referencedViews(Flow flow) {
            int[] referencedIds = flow.getReferencedIds();
            Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
            List d02 = C7705l.d0(referencedIds);
            ViewParent parent = flow.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ArrayList arrayList = new ArrayList();
            Iterator it = d02.iterator();
            while (it.hasNext()) {
                View findViewById = viewGroup.findViewById(((Number) it.next()).intValue());
                if (findViewById != null) {
                    arrayList.add(findViewById);
                }
            }
            return arrayList;
        }

        public final void bind(@NotNull List<BadgeDTO> badges) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            CellView.FlowBadgeListView flowBadgeListView = this.containerView;
            ViewParent parent = flowBadgeListView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            int size = this.childViews.size() - badges.size();
            int i11 = 0;
            if (size < 0) {
                int i12 = -size;
                for (int i13 = 0; i13 < i12; i13++) {
                    Context context = flowBadgeListView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
                    badgeView.setId(View.generateViewId());
                    this.childViews.add(badgeView);
                    viewGroup.addView(badgeView);
                }
            } else {
                for (int i14 = 0; i14 < size; i14++) {
                    ArrayList<View> arrayList = this.childViews;
                    viewGroup.removeView(arrayList.remove(C7714v.P(arrayList)));
                }
            }
            List<BadgeDTO> list = badges;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            for (Object obj : list) {
                int i15 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                BadgeDTO badgeDTO = (BadgeDTO) obj;
                View view = this.childViews.get(i11);
                BadgeView badgeView2 = view instanceof BadgeView ? (BadgeView) view : null;
                if (badgeView2 == null) {
                    return;
                }
                BadgeHolderKt.bind$default(badgeView2, badgeDTO, (Function1) null, 2, (Object) null);
                arrayList2.add(Integer.valueOf(badgeView2.getId()));
                i11 = i15;
            }
            flowBadgeListView.setReferencedIds(C7714v.T0(arrayList2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellHolder(@NotNull CellView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.badgeListHolder = k.b(new CellHolder$badgeListHolder$2(this));
        CellView containerView = getContainerView();
        containerView.getCenterBlock().setOnClickListener(new ViewOnClickListenerC4465n7(1, this, containerView));
        containerView.getLeftBlock().setOnClickListener(new a(2, this, containerView));
        containerView.getRightBlock().setOnClickListener(new XT.a(1, this, containerView));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bind(CellView.LeftBlock leftBlock, CellDTO.LeftBlock leftBlock2) {
        if (blockDtoIsNullOrEmpty(leftBlock2)) {
            ViewExtKt.gone(leftBlock);
            return;
        }
        RadioButtonView radioButtonView = null;
        if (leftBlock.get_iconView() != null) {
            IconHolderKt.bindOrGone$default(leftBlock.getIconView(), leftBlock2.getIcon(), null, 2, null);
        } else if (leftBlock2.getIcon() != null) {
            IconHolderKt.bind$default(leftBlock.getIconView(), leftBlock2.getIcon(), null, 2, null);
        }
        if (leftBlock.get_imageView() != null) {
            ImageHolderKt.bindOrGone$default(leftBlock.getImageView(), leftBlock2.getImage(), null, 2, null);
        } else if (leftBlock2.getImage() != null) {
            ImageHolderKt.bind$default(leftBlock.getImageView(), leftBlock2.getImage(), null, 2, null);
        }
        AtomDTO control = leftBlock2.getControl();
        if (control instanceof CheckBoxDTO) {
            CheckBoxView checkBoxView = leftBlock.getCheckBoxView();
            bindOrGone(checkBoxView, (CheckBoxDTO) leftBlock2.getControl());
            radioButtonView = checkBoxView;
        } else if (control instanceof RadioDTO) {
            RadioButtonView radioButtonView2 = leftBlock.getRadioButtonView();
            bindOrGone(radioButtonView2, (RadioDTO) leftBlock2.getControl());
            radioButtonView = radioButtonView2;
        } else if (control instanceof ToggleDTO) {
            ToggleView toggleView = leftBlock.getToggleView();
            ToggleHolderKt.bindOrGone$default(toggleView, (ToggleDTO) leftBlock2.getControl(), null, 2, null);
            radioButtonView = toggleView;
        }
        LinkedHashSet e11 = e0.e(leftBlock.get_checkBoxView(), leftBlock.get_toggleView(), leftBlock.get_radioButtonView());
        if (radioButtonView != null) {
            e11.remove(radioButtonView);
        }
        for (Object obj : e11) {
            if (obj != null) {
                ViewExtKt.gone((View) obj);
            }
        }
        bindCommonAddonSettings(leftBlock, leftBlock2);
        CommonCellSettings.LayoutPadding topPadding = leftBlock2.getTopPadding();
        Context context = leftBlock.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int pxOrNone = toPxOrNone(topPadding, context);
        CommonCellSettings.LayoutPadding rightPadding = leftBlock2.getRightPadding();
        Context context2 = leftBlock.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        leftBlock.setPadding(leftBlock.getPaddingLeft(), pxOrNone, toPxOrNone(rightPadding, context2), leftBlock.getPaddingBottom());
        ViewExtKt.show(leftBlock);
    }

    private final void bindCommonAddonSettings(CellView.AddonBlock addonBlock, CellDTO.AddonBlockDTO addonBlockDTO) {
        CellDTO.BlockAlignment alignment = addonBlockDTO.getAlignment();
        if (alignment == null) {
            alignment = CellDTO.BlockAlignment.ALIGNMENT_CENTER;
        }
        addonBlock.setAlignment(alignment.getAlignment());
        addonBlock.setHorizontalGap(toPxOrDefault(addonBlockDTO.getHorizontalSpaceBetween(), getContext(), CommonCellSettings.LayoutPadding.PADDING_350));
    }

    private final void bindOrGone(CheckBoxView checkBoxView, CheckBoxDTO checkBoxDTO) {
        if (checkBoxDTO == null) {
            ViewExtKt.gone(checkBoxView);
            return;
        }
        CheckBoxHolderKt.bind$default(checkBoxView, checkBoxDTO, null, 2, null);
        CheckBoxDTO.CheckBoxSize size = checkBoxDTO.getSize();
        if (size == null) {
            size = CheckBoxDTO.CheckBoxSize.SIZE_500;
        }
        checkBoxView.setDefinedSize$uni_release(size);
    }

    private final void bindSettings(CellView cellView, CellDTO.Settings settings) {
        CornerRadius cornerRadius;
        Boolean isDisabled;
        Boolean disableSeparator;
        CommonCellSettings.LayoutPadding leftPadding = settings != null ? settings.getLeftPadding() : null;
        Context context = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int pxOrNone = toPxOrNone(leftPadding, context);
        CommonCellSettings.LayoutPadding topPadding = settings != null ? settings.getTopPadding() : null;
        Context context2 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int pxOrNone2 = toPxOrNone(topPadding, context2);
        CommonCellSettings.LayoutPadding rightPadding = settings != null ? settings.getRightPadding() : null;
        Context context3 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int pxOrNone3 = toPxOrNone(rightPadding, context3);
        CommonCellSettings.LayoutPadding bottomPadding = settings != null ? settings.getBottomPadding() : null;
        Context context4 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        cellView.setPadding(pxOrNone, pxOrNone2, pxOrNone3, toPxOrNone(bottomPadding, context4));
        cellView.setHasSeparator(settings == null || (disableSeparator = settings.getDisableSeparator()) == null || !disableSeparator.booleanValue());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context5 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context5, settings != null ? settings.getSeparatorColor() : null);
        cellView.setSeparatorColor(parseColor != null ? parseColor.intValue() : androidx.core.content.a.getColor(cellView.getContext(), UniColors.GRAPHIC_NEUTRAL.getResId()));
        cellView.setEnabled(settings == null || (isDisabled = settings.isDisabled()) == null || !isDisabled.booleanValue());
        cellView.setCellCornerRadius((settings == null || (cornerRadius = settings.getCornerRadius()) == null) ? 0.0f : UiExtKt.toPxF(cornerRadius.getPx()));
        Context context6 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        cellView.setCellBackgroundColor(styleParser.parseColor(context6, settings != null ? settings.getBackgroundColor() : null, R.color.transparent));
        Context context7 = cellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        cellView.setCellHoverColor(styleParser.parseColor(context7, settings != null ? settings.getBackgroundHoverColor() : null, UniColors.LAYER_OVERLAY_PARANJA.getResId()));
    }

    private final boolean blockDtoIsNullOrEmpty(CellDTO.ContainerBlockDTO blockDto) {
        return blockDto == null || blockDto.getIsEmpty();
    }

    private final FlowBadgeListViewHolder getBadgeListHolder() {
        return (FlowBadgeListViewHolder) this.badgeListHolder.getValue();
    }

    private final boolean getHasAction(CellDTO cellDTO) {
        CommonControlSettings common;
        CommonControlSettings common2;
        CommonControlSettings common3 = cellDTO.getCommon();
        AtomActionDTO atomActionDTO = null;
        if ((common3 != null ? common3.getAction() : null) != null) {
            return true;
        }
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        if (((leftBlock == null || (common2 = leftBlock.getCommon()) == null) ? null : common2.getAction()) != null) {
            return true;
        }
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        if (rightBlock != null && (common = rightBlock.getCommon()) != null) {
            atomActionDTO = common.getAction();
        }
        return atomActionDTO != null;
    }

    private final void handeAction(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        handleAction(AtomActionMapperKt.toAtomAction(atomActionDTO, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$6$lambda$0(CellHolder cellHolder, CellView cellView, View view) {
        CommonControlSettings common;
        CommonControlSettings common2;
        CommonControlSettings common3;
        CommonControlSettings common4;
        CellDTO cellDTO = (CellDTO) cellHolder.getData();
        if (cellDTO.getIsDisabled()) {
            return;
        }
        CommonControlSettings common5 = cellDTO.getCommon();
        r1 = null;
        AtomActionDTO atomActionDTO = null;
        if ((common5 != null ? common5.getAction() : null) == null) {
            CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
            if (((leftBlock == null || (common2 = leftBlock.getCommon()) == null) ? null : common2.getAction()) != null) {
                cellView.getLeftBlock().callOnClick();
                return;
            }
            CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
            if (((rightBlock == null || (common = rightBlock.getCommon()) == null) ? null : common.getAction()) != null) {
                cellView.getRightBlock().callOnClick();
                return;
            }
            ViewParent parent = cellHolder.getContainerView().getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view2.callOnClick();
                return;
            }
            return;
        }
        cellHolder.handeAction(cellDTO.getCommon().getAction(), cellDTO.getTrackingInfo());
        CellDTO.LeftBlock leftBlock2 = cellDTO.getLeftBlock();
        if (((leftBlock2 == null || (common4 = leftBlock2.getCommon()) == null) ? null : common4.getAction()) == null) {
            CellDTO.Settings settings = cellDTO.getSettings();
            if (!(settings != null ? Intrinsics.d(settings.isAutoToggleDisabled(), Boolean.TRUE) : false)) {
                cellView.getLeftBlock().toggle();
            }
        }
        CellDTO.RightBlock rightBlock2 = cellDTO.getRightBlock();
        if (rightBlock2 != null && (common3 = rightBlock2.getCommon()) != null) {
            atomActionDTO = common3.getAction();
        }
        if (atomActionDTO == null) {
            CellDTO.Settings settings2 = cellDTO.getSettings();
            if (settings2 != null ? Intrinsics.d(settings2.isAutoToggleDisabled(), Boolean.TRUE) : false) {
                return;
            }
            cellView.getRightBlock().toggle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$6$lambda$2(CellHolder cellHolder, CellView cellView, View view) {
        CommonControlSettings common;
        AtomAction atomAction;
        CommonControlSettings common2;
        CellDTO cellDTO = (CellDTO) cellHolder.getData();
        if (cellDTO.getIsDisabled()) {
            return;
        }
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        if (leftBlock == null || (common = leftBlock.getCommon()) == null || (atomAction = common.toAtomAction()) == null) {
            cellHolder.getContainerView().getCenterBlock().callOnClick();
            return;
        }
        cellHolder.handleAction(atomAction);
        Unit unit = Unit.f71690a;
        CellDTO.Settings settings = cellDTO.getSettings();
        if (settings != null ? Intrinsics.d(settings.isAutoToggleDisabled(), Boolean.TRUE) : false) {
            return;
        }
        cellView.getLeftBlock().toggle();
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        if (((rightBlock == null || (common2 = rightBlock.getCommon()) == null) ? null : common2.getAction()) == null) {
            CommonControlSettings common3 = cellDTO.getCommon();
            if ((common3 != null ? common3.getAction() : null) == null) {
                cellView.getRightBlock().toggle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$6$lambda$5(CellHolder cellHolder, CellView cellView, View view) {
        CommonControlSettings common;
        AtomAction atomAction;
        CommonControlSettings common2;
        CellDTO cellDTO = (CellDTO) cellHolder.getData();
        if (cellDTO.getIsDisabled()) {
            return;
        }
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        if (rightBlock == null || (common = rightBlock.getCommon()) == null || (atomAction = common.toAtomAction()) == null) {
            cellHolder.getContainerView().getCenterBlock().callOnClick();
            return;
        }
        cellHolder.handleAction(atomAction);
        Unit unit = Unit.f71690a;
        CellDTO.Settings settings = cellDTO.getSettings();
        if (settings != null ? Intrinsics.d(settings.isAutoToggleDisabled(), Boolean.TRUE) : false) {
            return;
        }
        cellView.getRightBlock().toggle();
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        if (((leftBlock == null || (common2 = leftBlock.getCommon()) == null) ? null : common2.getAction()) == null) {
            CommonControlSettings common3 = cellDTO.getCommon();
            if ((common3 != null ? common3.getAction() : null) == null) {
                cellView.getLeftBlock().toggle();
            }
        }
    }

    private final int toPxOrDefault(CommonCellSettings.LayoutPadding layoutPadding, Context context, CommonCellSettings.LayoutPadding layoutPadding2) {
        Resources resources = context.getResources();
        if (layoutPadding == null) {
            layoutPadding = layoutPadding2;
        }
        return resources.getDimensionPixelSize(layoutPadding.getCellLayoutPadding());
    }

    private final int toPxOrNone(CommonCellSettings.LayoutPadding layoutPadding, Context context) {
        return toPxOrDefault(layoutPadding, context, CommonCellSettings.LayoutPadding.NONE);
    }

    private final IconDTO toTitleIconDto(CommonAtomIconDTO commonAtomIconDTO) {
        return new IconDTO(IconDTO.IconSize.SIZE_400, null, IconDTO.IconShape.SHAPE_NONE, null, commonAtomIconDTO, null, null, null, null, null, null, null, null, null, null, null, 65514, null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setLocatorTag(testId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CellDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CellHolder) item);
        CellView containerView = getContainerView();
        containerView.setClickable(getHasAction(item));
        bind(containerView.getLeftBlock(), item.getLeftBlock());
        bind(containerView.getCenterBlock(), item.getCenterBlock());
        bind(containerView.getRightBlock(), item.getRightBlock());
        bindSettings(containerView, item.getSettings());
    }

    private final void bindOrGone(RadioButtonView radioButtonView, RadioDTO radioDTO) {
        if (radioDTO == null) {
            ViewExtKt.gone(radioButtonView);
            return;
        }
        RadioButtonHolderKt.bind$default(radioButtonView, radioDTO, null, 2, null);
        RadioDTO.RadioSize size = radioDTO.getSize();
        if (size == null) {
            size = RadioDTO.RadioSize.SIZE_500;
        }
        radioButtonView.setDefinedSize$uni_release(size);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellHolder(@NotNull Context context, String str) {
        this(new CellView(context, null, 0, 0, null, 30, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindOrGone(CellView.FlowBadgeListView flowBadgeListView, List<BadgeDTO> list) {
        List<BadgeDTO> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            getBadgeListHolder().bind(list);
            ViewExtKt.show(flowBadgeListView);
        } else {
            ViewExtKt.gone(flowBadgeListView);
        }
    }

    private final void bindOrGone(CellView.TextView textView, CellDTO.CellText cellText) {
        if (cellText == null) {
            textView.setText((CharSequence) null);
            ViewExtKt.gone(textView);
        } else {
            bind(textView, cellText);
            ViewExtKt.show(textView);
        }
    }

    private final void bind(CellView.CenterBlock centerBlock, CellDTO.CenterBlock centerBlock2) {
        bind(centerBlock.getTitleView(), centerBlock2.getTitle());
        if (centerBlock.get_subtitleView() == null) {
            if (centerBlock2.getSubtitle() != null) {
                bind(centerBlock.getSubtitleView(), centerBlock2.getSubtitle());
            }
        } else {
            bindOrGone(centerBlock.getSubtitleView(), centerBlock2.getSubtitle());
        }
        if (centerBlock.get_titleBadgeView() == null) {
            if (centerBlock2.getTitleBadge() != null) {
                BadgeHolderKt.bind$default(centerBlock.getTitleBadgeView(), centerBlock2.getTitleBadge(), (Function1) null, 2, (Object) null);
            }
        } else {
            BadgeHolderKt.bindOrGone$default(centerBlock.getTitleBadgeView(), centerBlock2.getTitleBadge(), (Function1) null, 2, (Object) null);
        }
        BadgeView badgeView = centerBlock.get_titleBadgeView();
        if (badgeView != null) {
            badgeView.setClickable(false);
        }
        CommonAtomIconDTO titleIcon = centerBlock2.getTitleIcon();
        IconDTO titleIconDto = titleIcon != null ? toTitleIconDto(titleIcon) : null;
        if (centerBlock.get_titleIconView() != null) {
            IconHolderKt.bindOrGone$default(centerBlock.getTitleIconView(), titleIconDto, null, 2, null);
        } else if (titleIconDto != null) {
            IconHolderKt.bind$default(centerBlock.getTitleIconView(), titleIconDto, null, 2, null);
        }
        if (centerBlock.get_badgeListView() == null) {
            List<BadgeDTO> badgeList = centerBlock2.getBadgeList();
            if (badgeList != null && !badgeList.isEmpty()) {
                bindOrGone(centerBlock.getBadgeListView(), centerBlock2.getBadgeList());
            }
        } else {
            bindOrGone(centerBlock.getBadgeListView(), centerBlock2.getBadgeList());
        }
        CommonCellSettings.LayoutPadding titleSpaceBetween = centerBlock2.getTitleSpaceBetween();
        Context context = centerBlock.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        centerBlock.setTitleSubtitleGap(toPxOrDefault(titleSpaceBetween, context, CommonCellSettings.LayoutPadding.PADDING_100));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bind(CellView.RightBlock rightBlock, CellDTO.RightBlock rightBlock2) {
        if (blockDtoIsNullOrEmpty(rightBlock2)) {
            ViewExtKt.gone(rightBlock);
            return;
        }
        RadioButtonView radioButtonView = null;
        if (rightBlock.get_badgeView() == null) {
            if (rightBlock2.getBadge() != null) {
                BadgeHolderKt.bind$default(rightBlock.getBadgeView(), rightBlock2.getBadge(), (Function1) null, 2, (Object) null);
            }
        } else {
            BadgeHolderKt.bindOrGone$default(rightBlock.getBadgeView(), rightBlock2.getBadge(), (Function1) null, 2, (Object) null);
        }
        if (rightBlock.get_indicatorView() == null) {
            if (rightBlock2.getIndicator() != null) {
                IndicatorHolderKt.bind$default(rightBlock.getIndicatorView(), rightBlock2.getIndicator(), null, 2, null);
            }
        } else {
            IndicatorHolderKt.bindOrGone$default(rightBlock.getIndicatorView(), rightBlock2.getIndicator(), null, 2, null);
        }
        if (rightBlock.get_iconView() == null) {
            if (rightBlock2.getIcon() != null) {
                IconHolderKt.bind$default(rightBlock.getIconView(), rightBlock2.getIcon(), null, 2, null);
            }
        } else {
            IconHolderKt.bindOrGone$default(rightBlock.getIconView(), rightBlock2.getIcon(), null, 2, null);
        }
        if (rightBlock.get_buttonView() == null) {
            if (rightBlock2.getButton() != null) {
                ButtonV3HolderKt.bind$default(rightBlock.getButtonView(), rightBlock2.getButton(), null, 2, null);
            }
        } else {
            ButtonV3HolderKt.bindOrGone$default(rightBlock.getButtonView(), rightBlock2.getButton(), null, 2, null);
        }
        if (rightBlock.get_imageView() == null) {
            if (rightBlock2.getImage() != null) {
                ImageHolderKt.bind$default(rightBlock.getImageView(), rightBlock2.getImage(), null, 2, null);
            }
        } else {
            ImageHolderKt.bindOrGone$default(rightBlock.getImageView(), rightBlock2.getImage(), null, 2, null);
        }
        if (rightBlock.get_priceView() == null) {
            if (rightBlock2.getPrice() != null) {
                PriceAtomHolderKt.bind$default(rightBlock.getPriceView(), rightBlock2.getPrice(), null, 2, null);
            }
        } else {
            PriceAtomHolderKt.bindOrGone$default(rightBlock.getPriceView(), rightBlock2.getPrice(), null, 2, null);
        }
        AtomDTO control = rightBlock2.getControl();
        if (control instanceof CheckBoxDTO) {
            CheckBoxView checkBoxView = rightBlock.getCheckBoxView();
            bindOrGone(checkBoxView, (CheckBoxDTO) rightBlock2.getControl());
            radioButtonView = checkBoxView;
        } else if (control instanceof RadioDTO) {
            RadioButtonView radioButtonView2 = rightBlock.getRadioButtonView();
            bindOrGone(radioButtonView2, (RadioDTO) rightBlock2.getControl());
            radioButtonView = radioButtonView2;
        } else if (control instanceof ToggleDTO) {
            ToggleView toggleView = rightBlock.getToggleView();
            ToggleHolderKt.bindOrGone$default(toggleView, (ToggleDTO) rightBlock2.getControl(), null, 2, null);
            radioButtonView = toggleView;
        }
        LinkedHashSet e11 = e0.e(rightBlock.get_checkBoxView(), rightBlock.get_toggleView(), rightBlock.get_radioButtonView());
        if (radioButtonView != null) {
            e11.remove(radioButtonView);
        }
        for (Object obj : e11) {
            if (obj != null) {
                ViewExtKt.gone((View) obj);
            }
        }
        bindCommonAddonSettings(rightBlock, rightBlock2);
        CommonCellSettings.LayoutPadding topPadding = rightBlock2.getTopPadding();
        Context context = rightBlock.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int pxOrNone = toPxOrNone(topPadding, context);
        CommonCellSettings.LayoutPadding leftPadding = rightBlock2.getLeftPadding();
        Context context2 = rightBlock.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rightBlock.setPadding(toPxOrNone(leftPadding, context2), pxOrNone, rightBlock.getPaddingRight(), rightBlock.getPaddingBottom());
        ViewExtKt.show(rightBlock);
    }

    private final void bind(CellView.TextView textView, CellDTO.CellText cellText) {
        String str;
        Integer maxLines = cellText.getMaxLines();
        int intValue = maxLines != null ? maxLines.intValue() : 0;
        if (intValue == 0) {
            intValue = Integer.MAX_VALUE;
        }
        textView.setMaxLines(intValue);
        CommonAtomLabelDTO.TruncatingMode truncatingMode = cellText.getTruncatingMode();
        if (truncatingMode == null) {
            truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        }
        textView.setEllipsize(truncatingMode.getAsTruncateAt$uni_release());
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(cellText.getTypographyToken());
        TextViewExtKt.applyStyle(textView, context, parseTextStyle != null ? parseTextStyle.intValue() : UniTextStyles.COMPACT_500_MEDIUM.getResId());
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, cellText.getTextColor());
        if (parseColor != null) {
            textView.setTextColor(parseColor.intValue());
        }
        if (cellText.getTagSupported()) {
            textView.setMovementMethod(LinkOnlyMovementMethod.INSTANCE);
            textView.setClickable(false);
            textView.setLongClickable(false);
            OzonSpannableString text = cellText.getText();
            Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            OzonSpannableStringExtKt.applyUnderlineFlag(text, context3);
            str = text;
        } else {
            String obj = cellText.getText().toString();
            Intrinsics.f(obj);
            str = obj;
        }
        textView.setText(str);
    }
}
