package ru.ozon.fintech.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerBinder;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.action.ActionTextItemState;
import ru.ozon.fintech.ui.action.ActionTextItemView;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2State;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2View;
import ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapper;
import ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState;
import ru.ozon.fintech.ui.box20.BoxV20State;
import ru.ozon.fintech.ui.box20.BoxV20View;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;
import ru.ozon.fintech.ui.button.small.FinSmallButtonView;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView;
import ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State;
import ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20View;
import ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State;
import ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22View;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView;
import ru.ozon.fintech.ui.card.CardState;
import ru.ozon.fintech.ui.card.CardView;
import ru.ozon.fintech.ui.cardV2.CardV2State;
import ru.ozon.fintech.ui.cardV2.CardV2View;
import ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState;
import ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView;
import ru.ozon.fintech.ui.columnV20.ColumnV20State;
import ru.ozon.fintech.ui.columnV20.ColumnV20View;
import ru.ozon.fintech.ui.container.RecyclerContainerItem;
import ru.ozon.fintech.ui.container.RecyclerContainerItemView;
import ru.ozon.fintech.ui.header.HeaderItem;
import ru.ozon.fintech.ui.header.HeaderItemView;
import ru.ozon.fintech.ui.horizontalthree.HorizontalThreeState;
import ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView;
import ru.ozon.fintech.ui.iconcard.IconCardState;
import ru.ozon.fintech.ui.iconcard.IconCardView;
import ru.ozon.fintech.ui.image.FinImageState;
import ru.ozon.fintech.ui.image.FinImageView;
import ru.ozon.fintech.ui.imageV2.FinImageV2State;
import ru.ozon.fintech.ui.imageV2.FinImageV2View;
import ru.ozon.fintech.ui.imageV20.FinImageV20State;
import ru.ozon.fintech.ui.imageV20.FinImageV20View;
import ru.ozon.fintech.ui.input.FinInputState;
import ru.ozon.fintech.ui.input.FinInputView;
import ru.ozon.fintech.ui.labelV20.LabelV20WrapperState;
import ru.ozon.fintech.ui.labelV20.LabelV20WrapperView;
import ru.ozon.fintech.ui.lazycolumn.LazyColumnState;
import ru.ozon.fintech.ui.lazycolumn.LazyColumnView;
import ru.ozon.fintech.ui.lottie.FinLottieState;
import ru.ozon.fintech.ui.lottie.FinLottieView;
import ru.ozon.fintech.ui.lottieV20.LottieV20State;
import ru.ozon.fintech.ui.lottieV20.LottieV20View;
import ru.ozon.fintech.ui.menuitem.MenuItemState;
import ru.ozon.fintech.ui.menuitem.MenuItemView;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItem;
import ru.ozon.fintech.ui.pdf.PdfPreviewListItemView;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapper;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState;
import ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressState;
import ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView;
import ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State;
import ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20View;
import ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State;
import ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20View;
import ru.ozon.fintech.ui.promo.PromoState;
import ru.ozon.fintech.ui.promo.PromoView;
import ru.ozon.fintech.ui.promoV2.PromoV2State;
import ru.ozon.fintech.ui.promoV2.PromoV2View;
import ru.ozon.fintech.ui.qrcode.QrCodeState;
import ru.ozon.fintech.ui.qrcode.QrCodeView;
import ru.ozon.fintech.ui.radio.RadioWrapperState;
import ru.ozon.fintech.ui.radio.RadioWrapperView;
import ru.ozon.fintech.ui.radioV20.RadioWrapperV20State;
import ru.ozon.fintech.ui.radioV20.RadioWrapperV20View;
import ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State;
import ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20View;
import ru.ozon.fintech.ui.row.lazyrow.LazyRowState;
import ru.ozon.fintech.ui.row.lazyrow.LazyRowView;
import ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State;
import ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View;
import ru.ozon.fintech.ui.row.verticalrow.VerticalRowState;
import ru.ozon.fintech.ui.row.verticalrow.VerticalRowView;
import ru.ozon.fintech.ui.rowV20.RowV20State;
import ru.ozon.fintech.ui.rowV20.RowV20View;
import ru.ozon.fintech.ui.separator.SeparatorState;
import ru.ozon.fintech.ui.separator.SeparatorView;
import ru.ozon.fintech.ui.smalllabel.SmallLabelState;
import ru.ozon.fintech.ui.smalllabel.SmallLabelView;
import ru.ozon.fintech.ui.snackbar.FinSnackbarState;
import ru.ozon.fintech.ui.snackbar.FinSnackbarView;
import ru.ozon.fintech.ui.storyprogress.StoryProgressState;
import ru.ozon.fintech.ui.storyprogress.StoryProgressView;
import ru.ozon.fintech.ui.textareaV20.TextAreaWrapperState;
import ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView;
import ru.ozon.fintech.ui.textareaV22.TextAreaV22State;
import ru.ozon.fintech.ui.textareaV22.TextAreaV22View;
import ru.ozon.fintech.ui.textatom.TextAtomWrapperState;
import ru.ozon.fintech.ui.textatom.TextAtomWrapperView;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState;
import ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView;
import ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperState;
import ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView;
import ru.ozon.fintech.ui.textfield.TextFieldWrapperState;
import ru.ozon.fintech.ui.textfield.TextFieldWrapperView;
import ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState;
import ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView;
import ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperState;
import ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperView;
import ru.ozon.fintech.ui.thumb.ThumbState;
import ru.ozon.fintech.ui.thumb.ThumbView;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/ui/RecyclerBinderImpl;", "Lcom/detmir/recycli/adapters/RecyclerBinder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "", "state", "Lcom/detmir/recycli/adapters/RecyclerItem;", "item", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/lang/String;Lcom/detmir/recycli/adapters/RecyclerItem;)V", "recyclerItemState", "getItemViewType", "(Ljava/lang/String;)I", "Ljava/util/HashMap;", "stateToIndexMap", "Ljava/util/HashMap;", "getStateToIndexMap", "()Ljava/util/HashMap;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecyclerBinderImpl implements RecyclerBinder {

    @NotNull
    private final HashMap<String, Integer> stateToIndexMap = U.f(new Pair("ru.ozon.fintech.ui.action.ActionTextItemState#default", 0), new Pair("ru.ozon.fintech.ui.action.ActionTextItemState#ru.ozon.fintech.ui.action.ActionTextItemView", 0), new Pair("ru.ozon.fintech.ui.actionV2.ActionTextItemV2State#default", 1), new Pair("ru.ozon.fintech.ui.actionV2.ActionTextItemV2State#ru.ozon.fintech.ui.actionV2.ActionTextItemV2View", 1), new Pair("ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState#default", 2), new Pair("ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState#ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapper", 2), new Pair("ru.ozon.fintech.ui.box20.BoxV20State#default", 3), new Pair("ru.ozon.fintech.ui.box20.BoxV20State#ru.ozon.fintech.ui.box20.BoxV20View", 3), new Pair("ru.ozon.fintech.ui.button.large.FinLargeButtonState#default", 4), new Pair("ru.ozon.fintech.ui.button.large.FinLargeButtonState#ru.ozon.fintech.ui.button.large.FinLargeButtonView", 4), new Pair("ru.ozon.fintech.ui.button.small.FinSmallButtonState#default", 5), new Pair("ru.ozon.fintech.ui.button.small.FinSmallButtonState#ru.ozon.fintech.ui.button.small.FinSmallButtonView", 5), new Pair("ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem.State#default", 6), new Pair("ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem.State#ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView", 6), new Pair("ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State#default", 7), new Pair("ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State#ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20View", 7), new Pair("ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State#default", 8), new Pair("ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State#ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22View", 8), new Pair("ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState#default", 9), new Pair("ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState#ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView", 9), new Pair("ru.ozon.fintech.ui.card.CardState#default", 10), new Pair("ru.ozon.fintech.ui.card.CardState#ru.ozon.fintech.ui.card.CardView", 10), new Pair("ru.ozon.fintech.ui.cardV2.CardV2State#default", 11), new Pair("ru.ozon.fintech.ui.cardV2.CardV2State#ru.ozon.fintech.ui.cardV2.CardV2View", 11), new Pair("ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState#default", 12), new Pair("ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState#ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView", 12), new Pair("ru.ozon.fintech.ui.columnV20.ColumnV20State#default", 13), new Pair("ru.ozon.fintech.ui.columnV20.ColumnV20State#ru.ozon.fintech.ui.columnV20.ColumnV20View", 13), new Pair("ru.ozon.fintech.ui.container.RecyclerContainerItem#default", 14), new Pair("ru.ozon.fintech.ui.container.RecyclerContainerItem#ru.ozon.fintech.ui.container.RecyclerContainerItemView", 14), new Pair("ru.ozon.fintech.ui.header.HeaderItem#default", 15), new Pair("ru.ozon.fintech.ui.header.HeaderItem#ru.ozon.fintech.ui.header.HeaderItemView", 15), new Pair("ru.ozon.fintech.ui.horizontalthree.HorizontalThreeState#default", 16), new Pair("ru.ozon.fintech.ui.horizontalthree.HorizontalThreeState#ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView", 16), new Pair("ru.ozon.fintech.ui.iconcard.IconCardState#default", 17), new Pair("ru.ozon.fintech.ui.iconcard.IconCardState#ru.ozon.fintech.ui.iconcard.IconCardView", 17), new Pair("ru.ozon.fintech.ui.image.FinImageState#default", 18), new Pair("ru.ozon.fintech.ui.image.FinImageState#ru.ozon.fintech.ui.image.FinImageView", 18), new Pair("ru.ozon.fintech.ui.imageV2.FinImageV2State#default", 19), new Pair("ru.ozon.fintech.ui.imageV2.FinImageV2State#ru.ozon.fintech.ui.imageV2.FinImageV2View", 19), new Pair("ru.ozon.fintech.ui.imageV20.FinImageV20State#default", 20), new Pair("ru.ozon.fintech.ui.imageV20.FinImageV20State#ru.ozon.fintech.ui.imageV20.FinImageV20View", 20), new Pair("ru.ozon.fintech.ui.input.FinInputState#default", 21), new Pair("ru.ozon.fintech.ui.input.FinInputState#ru.ozon.fintech.ui.input.FinInputView", 21), new Pair("ru.ozon.fintech.ui.labelV20.LabelV20WrapperState#default", 22), new Pair("ru.ozon.fintech.ui.labelV20.LabelV20WrapperState#ru.ozon.fintech.ui.labelV20.LabelV20WrapperView", 22), new Pair("ru.ozon.fintech.ui.lazycolumn.LazyColumnState#default", 23), new Pair("ru.ozon.fintech.ui.lazycolumn.LazyColumnState#ru.ozon.fintech.ui.lazycolumn.LazyColumnView", 23), new Pair("ru.ozon.fintech.ui.lottie.FinLottieState#default", 24), new Pair("ru.ozon.fintech.ui.lottie.FinLottieState#ru.ozon.fintech.ui.lottie.FinLottieView", 24), new Pair("ru.ozon.fintech.ui.lottieV20.LottieV20State#default", 25), new Pair("ru.ozon.fintech.ui.lottieV20.LottieV20State#ru.ozon.fintech.ui.lottieV20.LottieV20View", 25), new Pair("ru.ozon.fintech.ui.menuitem.MenuItemState#default", 26), new Pair("ru.ozon.fintech.ui.menuitem.MenuItemState#ru.ozon.fintech.ui.menuitem.MenuItemView", 26), new Pair("ru.ozon.fintech.ui.pdf.PdfPreviewListItem#default", 27), new Pair("ru.ozon.fintech.ui.pdf.PdfPreviewListItem#ru.ozon.fintech.ui.pdf.PdfPreviewListItemView", 27), new Pair("ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState#default", 28), new Pair("ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState#ru.ozon.fintech.ui.pinprogress.PinProgressWrapper", 28), new Pair("ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressState#default", 29), new Pair("ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressState#ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView", 29), new Pair("ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State#default", 30), new Pair("ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State#ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20View", 30), new Pair("ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State#default", 31), new Pair("ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State#ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20View", 31), new Pair("ru.ozon.fintech.ui.promo.PromoState#default", 32), new Pair("ru.ozon.fintech.ui.promo.PromoState#ru.ozon.fintech.ui.promo.PromoView", 32), new Pair("ru.ozon.fintech.ui.promoV2.PromoV2State#default", 33), new Pair("ru.ozon.fintech.ui.promoV2.PromoV2State#ru.ozon.fintech.ui.promoV2.PromoV2View", 33), new Pair("ru.ozon.fintech.ui.qrcode.QrCodeState#default", 34), new Pair("ru.ozon.fintech.ui.qrcode.QrCodeState#ru.ozon.fintech.ui.qrcode.QrCodeView", 34), new Pair("ru.ozon.fintech.ui.radio.RadioWrapperState#default", 35), new Pair("ru.ozon.fintech.ui.radio.RadioWrapperState#ru.ozon.fintech.ui.radio.RadioWrapperView", 35), new Pair("ru.ozon.fintech.ui.radioV20.RadioWrapperV20State#default", 36), new Pair("ru.ozon.fintech.ui.radioV20.RadioWrapperV20State#ru.ozon.fintech.ui.radioV20.RadioWrapperV20View", 36), new Pair("ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State#default", 37), new Pair("ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State#ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20View", 37), new Pair("ru.ozon.fintech.ui.row.lazyrow.LazyRowState#default", 38), new Pair("ru.ozon.fintech.ui.row.lazyrow.LazyRowState#ru.ozon.fintech.ui.row.lazyrow.LazyRowView", 38), new Pair("ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State#default", 39), new Pair("ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State#ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View", 39), new Pair("ru.ozon.fintech.ui.row.verticalrow.VerticalRowState#default", 40), new Pair("ru.ozon.fintech.ui.row.verticalrow.VerticalRowState#ru.ozon.fintech.ui.row.verticalrow.VerticalRowView", 40), new Pair("ru.ozon.fintech.ui.rowV20.RowV20State#default", 41), new Pair("ru.ozon.fintech.ui.rowV20.RowV20State#ru.ozon.fintech.ui.rowV20.RowV20View", 41), new Pair("ru.ozon.fintech.ui.separator.SeparatorState#default", 42), new Pair("ru.ozon.fintech.ui.separator.SeparatorState#ru.ozon.fintech.ui.separator.SeparatorView", 42), new Pair("ru.ozon.fintech.ui.smalllabel.SmallLabelState#default", 43), new Pair("ru.ozon.fintech.ui.smalllabel.SmallLabelState#ru.ozon.fintech.ui.smalllabel.SmallLabelView", 43), new Pair("ru.ozon.fintech.ui.snackbar.FinSnackbarState#default", 44), new Pair("ru.ozon.fintech.ui.snackbar.FinSnackbarState#ru.ozon.fintech.ui.snackbar.FinSnackbarView", 44), new Pair("ru.ozon.fintech.ui.storyprogress.StoryProgressState#default", 45), new Pair("ru.ozon.fintech.ui.storyprogress.StoryProgressState#ru.ozon.fintech.ui.storyprogress.StoryProgressView", 45), new Pair("ru.ozon.fintech.ui.textareaV20.TextAreaWrapperState#default", 46), new Pair("ru.ozon.fintech.ui.textareaV20.TextAreaWrapperState#ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView", 46), new Pair("ru.ozon.fintech.ui.textareaV22.TextAreaV22State#default", 47), new Pair("ru.ozon.fintech.ui.textareaV22.TextAreaV22State#ru.ozon.fintech.ui.textareaV22.TextAreaV22View", 47), new Pair("ru.ozon.fintech.ui.textatom.TextAtomWrapperState#default", 48), new Pair("ru.ozon.fintech.ui.textatom.TextAtomWrapperState#ru.ozon.fintech.ui.textatom.TextAtomWrapperView", 48), new Pair("ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState#default", 49), new Pair("ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState#ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView", 49), new Pair("ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperState#default", 50), new Pair("ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperState#ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView", 50), new Pair("ru.ozon.fintech.ui.textfield.TextFieldWrapperState#default", 51), new Pair("ru.ozon.fintech.ui.textfield.TextFieldWrapperState#ru.ozon.fintech.ui.textfield.TextFieldWrapperView", 51), new Pair("ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState#default", 52), new Pair("ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState#ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView", 52), new Pair("ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperState#default", 53), new Pair("ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperState#ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperView", 53), new Pair("ru.ozon.fintech.ui.thumb.ThumbState#default", 54), new Pair("ru.ozon.fintech.ui.thumb.ThumbState#ru.ozon.fintech.ui.thumb.ThumbView", 54), new Pair("ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState#default", 55), new Pair("ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState#ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView", 55));

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    public int getItemViewType(@NotNull String recyclerItemState) {
        Intrinsics.checkNotNullParameter(recyclerItemState, "recyclerItemState");
        Integer num = getStateToIndexMap().get(recyclerItemState);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    @NotNull
    public HashMap<String, Integer> getStateToIndexMap() {
        return this.stateToIndexMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.detmir.recycli.adapters.RecyclerBinder
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull String state, @NotNull RecyclerItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        switch (state.hashCode()) {
            case -2017166858:
                if (state.equals("ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState#default")) {
                    View view = holder.itemView;
                    Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView");
                    ((ButtonAtomWrapperView) view).bindState((ButtonAtomWrapperState) item);
                    break;
                }
                break;
            case -1994563202:
                if (state.equals("ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState#default")) {
                    View view2 = holder.itemView;
                    Intrinsics.g(view2, "null cannot be cast to non-null type ru.ozon.fintech.ui.pinprogress.PinProgressWrapper");
                    ((PinProgressWrapper) view2).bindState((PinProgressWrapperState) item);
                    break;
                }
                break;
            case -1990253453:
                if (state.equals("ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressState#ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView")) {
                    View view3 = holder.itemView;
                    Intrinsics.g(view3, "null cannot be cast to non-null type ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView");
                    ((HorizontalProgressView) view3).bindState((HorizontalProgressState) item);
                    break;
                }
                break;
            case -1973324186:
                if (state.equals("ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperState#default")) {
                    View view4 = holder.itemView;
                    Intrinsics.g(view4, "null cannot be cast to non-null type ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView");
                    ((TextAtomV20WrapperView) view4).bindState((TextAtomV20WrapperState) item);
                    break;
                }
                break;
            case -1940981376:
                if (state.equals("ru.ozon.fintech.ui.lottie.FinLottieState#default")) {
                    View view5 = holder.itemView;
                    Intrinsics.g(view5, "null cannot be cast to non-null type ru.ozon.fintech.ui.lottie.FinLottieView");
                    ((FinLottieView) view5).bindState((FinLottieState) item);
                    break;
                }
                break;
            case -1919880235:
                if (state.equals("ru.ozon.fintech.ui.card.CardState#default")) {
                    View view6 = holder.itemView;
                    Intrinsics.g(view6, "null cannot be cast to non-null type ru.ozon.fintech.ui.card.CardView");
                    ((CardView) view6).bindState((CardState) item);
                    break;
                }
                break;
            case -1917189453:
                if (state.equals("ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State#ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20View")) {
                    View view7 = holder.itemView;
                    Intrinsics.g(view7, "null cannot be cast to non-null type ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20View");
                    ((HorizontalProgressV20View) view7).bindState((HorizontalProgressV20State) item);
                    break;
                }
                break;
            case -1893699075:
                if (state.equals("ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperState#default")) {
                    View view8 = holder.itemView;
                    Intrinsics.g(view8, "null cannot be cast to non-null type ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperView");
                    ((InputV20WrapperView) view8).bindState((InputV20WrapperState) item);
                    break;
                }
                break;
            case -1876610549:
                if (state.equals("ru.ozon.fintech.ui.lazycolumn.LazyColumnState#ru.ozon.fintech.ui.lazycolumn.LazyColumnView")) {
                    View view9 = holder.itemView;
                    Intrinsics.g(view9, "null cannot be cast to non-null type ru.ozon.fintech.ui.lazycolumn.LazyColumnView");
                    ((LazyColumnView) view9).bindState((LazyColumnState) item);
                    break;
                }
                break;
            case -1753825965:
                if (state.equals("ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState#ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView")) {
                    View view10 = holder.itemView;
                    Intrinsics.g(view10, "null cannot be cast to non-null type ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView");
                    ((ButtonAtomWrapperView) view10).bindState((ButtonAtomWrapperState) item);
                    break;
                }
                break;
            case -1739812207:
                if (state.equals("ru.ozon.fintech.ui.button.large.FinLargeButtonState#ru.ozon.fintech.ui.button.large.FinLargeButtonView")) {
                    View view11 = holder.itemView;
                    Intrinsics.g(view11, "null cannot be cast to non-null type ru.ozon.fintech.ui.button.large.FinLargeButtonView");
                    ((FinLargeButtonView) view11).bindState((FinLargeButtonState) item);
                    break;
                }
                break;
            case -1605255365:
                if (state.equals("ru.ozon.fintech.ui.horizontalthree.HorizontalThreeState#ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView")) {
                    View view12 = holder.itemView;
                    Intrinsics.g(view12, "null cannot be cast to non-null type ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView");
                    ((HorizontalThreeView) view12).bindState((HorizontalThreeState) item);
                    break;
                }
                break;
            case -1584024523:
                if (state.equals("ru.ozon.fintech.ui.columnV20.ColumnV20State#default")) {
                    View view13 = holder.itemView;
                    Intrinsics.g(view13, "null cannot be cast to non-null type ru.ozon.fintech.ui.columnV20.ColumnV20View");
                    ((ColumnV20View) view13).bindState((ColumnV20State) item);
                    break;
                }
                break;
            case -1559441259:
                if (state.equals("ru.ozon.fintech.ui.actionV2.ActionTextItemV2State#default")) {
                    View view14 = holder.itemView;
                    Intrinsics.g(view14, "null cannot be cast to non-null type ru.ozon.fintech.ui.actionV2.ActionTextItemV2View");
                    ((ActionTextItemV2View) view14).bindState((ActionTextItemV2State) item);
                    break;
                }
                break;
            case -1535368493:
                if (state.equals("ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState#ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView")) {
                    View view15 = holder.itemView;
                    Intrinsics.g(view15, "null cannot be cast to non-null type ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView");
                    ((TextFieldV20WrapperView) view15).bindState((TextFieldV20WrapperState) item);
                    break;
                }
                break;
            case -1529013741:
                if (state.equals("ru.ozon.fintech.ui.promo.PromoState#default")) {
                    View view16 = holder.itemView;
                    Intrinsics.g(view16, "null cannot be cast to non-null type ru.ozon.fintech.ui.promo.PromoView");
                    ((PromoView) view16).bindState((PromoState) item);
                    break;
                }
                break;
            case -1524741173:
                if (state.equals("ru.ozon.fintech.ui.iconcard.IconCardState#ru.ozon.fintech.ui.iconcard.IconCardView")) {
                    View view17 = holder.itemView;
                    Intrinsics.g(view17, "null cannot be cast to non-null type ru.ozon.fintech.ui.iconcard.IconCardView");
                    ((IconCardView) view17).bindState((IconCardState) item);
                    break;
                }
                break;
            case -1519595285:
                if (state.equals("ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State#default")) {
                    View view18 = holder.itemView;
                    Intrinsics.g(view18, "null cannot be cast to non-null type ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20View");
                    ((ButtonAtomWrapperV20View) view18).bindState((ButtonAtomWrapperV20State) item);
                    break;
                }
                break;
            case -1429159669:
                if (state.equals("ru.ozon.fintech.ui.qrcode.QrCodeState#ru.ozon.fintech.ui.qrcode.QrCodeView")) {
                    View view19 = holder.itemView;
                    Intrinsics.g(view19, "null cannot be cast to non-null type ru.ozon.fintech.ui.qrcode.QrCodeView");
                    ((QrCodeView) view19).bindState((QrCodeState) item);
                    break;
                }
                break;
            case -1403496113:
                if (state.equals("ru.ozon.fintech.ui.promo.PromoState#ru.ozon.fintech.ui.promo.PromoView")) {
                    View view20 = holder.itemView;
                    Intrinsics.g(view20, "null cannot be cast to non-null type ru.ozon.fintech.ui.promo.PromoView");
                    ((PromoView) view20).bindState((PromoState) item);
                    break;
                }
                break;
            case -1402234484:
                if (state.equals("ru.ozon.fintech.ui.imageV20.FinImageV20State#default")) {
                    View view21 = holder.itemView;
                    Intrinsics.g(view21, "null cannot be cast to non-null type ru.ozon.fintech.ui.imageV20.FinImageV20View");
                    ((FinImageV20View) view21).bindState((FinImageV20State) item);
                    break;
                }
                break;
            case -1395257025:
                if (state.equals("ru.ozon.fintech.ui.promoV2.PromoV2State#ru.ozon.fintech.ui.promoV2.PromoV2View")) {
                    View view22 = holder.itemView;
                    Intrinsics.g(view22, "null cannot be cast to non-null type ru.ozon.fintech.ui.promoV2.PromoV2View");
                    ((PromoV2View) view22).bindState((PromoV2State) item);
                    break;
                }
                break;
            case -1383811592:
                if (state.equals("ru.ozon.fintech.ui.image.FinImageState#default")) {
                    View view23 = holder.itemView;
                    Intrinsics.g(view23, "null cannot be cast to non-null type ru.ozon.fintech.ui.image.FinImageView");
                    ((FinImageView) view23).bindState((FinImageState) item);
                    break;
                }
                break;
            case -1360576829:
                if (state.equals("ru.ozon.fintech.ui.row.lazyrow.LazyRowState#ru.ozon.fintech.ui.row.lazyrow.LazyRowView")) {
                    View view24 = holder.itemView;
                    Intrinsics.g(view24, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.lazyrow.LazyRowView");
                    ((LazyRowView) view24).bindState((LazyRowState) item);
                    break;
                }
                break;
            case -1333049973:
                if (state.equals("ru.ozon.fintech.ui.columnV20.ColumnV20State#ru.ozon.fintech.ui.columnV20.ColumnV20View")) {
                    View view25 = holder.itemView;
                    Intrinsics.g(view25, "null cannot be cast to non-null type ru.ozon.fintech.ui.columnV20.ColumnV20View");
                    ((ColumnV20View) view25).bindState((ColumnV20State) item);
                    break;
                }
                break;
            case -1332542125:
                if (state.equals("ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState#ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView")) {
                    View view26 = holder.itemView;
                    Intrinsics.g(view26, "null cannot be cast to non-null type ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView");
                    ((ToggleAtomWrapperView) view26).bindState((ToggleAtomWrapperState) item);
                    break;
                }
                break;
            case -1329826043:
                if (state.equals("ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem.State#ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView")) {
                    View view27 = holder.itemView;
                    Intrinsics.g(view27, "null cannot be cast to non-null type ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView");
                    ((FinSwitchItemView) view27).bindState((FinSwitchItem.State) item);
                    break;
                }
                break;
            case -1319340077:
                if (state.equals("ru.ozon.fintech.ui.labelV20.LabelV20WrapperState#ru.ozon.fintech.ui.labelV20.LabelV20WrapperView")) {
                    View view28 = holder.itemView;
                    Intrinsics.g(view28, "null cannot be cast to non-null type ru.ozon.fintech.ui.labelV20.LabelV20WrapperView");
                    ((LabelV20WrapperView) view28).bindState((LabelV20WrapperState) item);
                    break;
                }
                break;
            case -1283789717:
                if (state.equals("ru.ozon.fintech.ui.header.HeaderItem#default")) {
                    View view29 = holder.itemView;
                    Intrinsics.g(view29, "null cannot be cast to non-null type ru.ozon.fintech.ui.header.HeaderItemView");
                    ((HeaderItemView) view29).bindState((HeaderItem) item);
                    break;
                }
                break;
            case -1276577131:
                if (state.equals("ru.ozon.fintech.ui.iconcard.IconCardState#default")) {
                    View view30 = holder.itemView;
                    Intrinsics.g(view30, "null cannot be cast to non-null type ru.ozon.fintech.ui.iconcard.IconCardView");
                    ((IconCardView) view30).bindState((IconCardState) item);
                    break;
                }
                break;
            case -1216971095:
                if (state.equals("ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State#default")) {
                    View view31 = holder.itemView;
                    Intrinsics.g(view31, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20View");
                    ((FlexRowV20View) view31).bindState((FlexRowV20State) item);
                    break;
                }
                break;
            case -1157733133:
                if (state.equals("ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem.State#default")) {
                    View view32 = holder.itemView;
                    Intrinsics.g(view32, "null cannot be cast to non-null type ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView");
                    ((FinSwitchItemView) view32).bindState((FinSwitchItem.State) item);
                    break;
                }
                break;
            case -1118066067:
                if (state.equals("ru.ozon.fintech.ui.box20.BoxV20State#default")) {
                    View view33 = holder.itemView;
                    Intrinsics.g(view33, "null cannot be cast to non-null type ru.ozon.fintech.ui.box20.BoxV20View");
                    ((BoxV20View) view33).bindState((BoxV20State) item);
                    break;
                }
                break;
            case -1061380269:
                if (state.equals("ru.ozon.fintech.ui.textfield.TextFieldWrapperState#ru.ozon.fintech.ui.textfield.TextFieldWrapperView")) {
                    View view34 = holder.itemView;
                    Intrinsics.g(view34, "null cannot be cast to non-null type ru.ozon.fintech.ui.textfield.TextFieldWrapperView");
                    ((TextFieldWrapperView) view34).bindState((TextFieldWrapperState) item);
                    break;
                }
                break;
            case -1038663289:
                if (state.equals("ru.ozon.fintech.ui.lottieV20.LottieV20State#default")) {
                    View view35 = holder.itemView;
                    Intrinsics.g(view35, "null cannot be cast to non-null type ru.ozon.fintech.ui.lottieV20.LottieV20View");
                    ((LottieV20View) view35).bindState((LottieV20State) item);
                    break;
                }
                break;
            case -998569034:
                if (state.equals("ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperState#default")) {
                    View view36 = holder.itemView;
                    Intrinsics.g(view36, "null cannot be cast to non-null type ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView");
                    ((TextFieldV20WrapperView) view36).bindState((TextFieldV20WrapperState) item);
                    break;
                }
                break;
            case -991932073:
                if (state.equals("ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20State#default")) {
                    View view37 = holder.itemView;
                    Intrinsics.g(view37, "null cannot be cast to non-null type ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20View");
                    ((HorizontalProgressV20View) view37).bindState((HorizontalProgressV20State) item);
                    break;
                }
                break;
            case -935843357:
                if (state.equals("ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State#ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View")) {
                    View view38 = holder.itemView;
                    Intrinsics.g(view38, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View");
                    ((LazyRowV20View) view38).bindState((LazyRowV20State) item);
                    break;
                }
                break;
            case -843616165:
                if (state.equals("ru.ozon.fintech.ui.storyprogress.StoryProgressState#ru.ozon.fintech.ui.storyprogress.StoryProgressView")) {
                    View view39 = holder.itemView;
                    Intrinsics.g(view39, "null cannot be cast to non-null type ru.ozon.fintech.ui.storyprogress.StoryProgressView");
                    ((StoryProgressView) view39).bindState((StoryProgressState) item);
                    break;
                }
                break;
            case -816449453:
                if (state.equals("ru.ozon.fintech.ui.input.FinInputState#ru.ozon.fintech.ui.input.FinInputView")) {
                    View view40 = holder.itemView;
                    Intrinsics.g(view40, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.FinInputView");
                    ((FinInputView) view40).bindState((FinInputState) item);
                    break;
                }
                break;
            case -814391821:
                if (state.equals("ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperState#ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperView")) {
                    View view41 = holder.itemView;
                    Intrinsics.g(view41, "null cannot be cast to non-null type ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperView");
                    ((InputV20WrapperView) view41).bindState((InputV20WrapperState) item);
                    break;
                }
                break;
            case -810899323:
                if (state.equals("ru.ozon.fintech.ui.thumb.ThumbState#default")) {
                    View view42 = holder.itemView;
                    Intrinsics.g(view42, "null cannot be cast to non-null type ru.ozon.fintech.ui.thumb.ThumbView");
                    ((ThumbView) view42).bindState((ThumbState) item);
                    break;
                }
                break;
            case -772678858:
                if (state.equals("ru.ozon.fintech.ui.labelV20.LabelV20WrapperState#default")) {
                    View view43 = holder.itemView;
                    Intrinsics.g(view43, "null cannot be cast to non-null type ru.ozon.fintech.ui.labelV20.LabelV20WrapperView");
                    ((LabelV20WrapperView) view43).bindState((LabelV20WrapperState) item);
                    break;
                }
                break;
            case -727130733:
                if (state.equals("ru.ozon.fintech.ui.snackbar.FinSnackbarState#ru.ozon.fintech.ui.snackbar.FinSnackbarView")) {
                    View view44 = holder.itemView;
                    Intrinsics.g(view44, "null cannot be cast to non-null type ru.ozon.fintech.ui.snackbar.FinSnackbarView");
                    ((FinSnackbarView) view44).bindState((FinSnackbarState) item);
                    break;
                }
                break;
            case -681190451:
                if (state.equals("ru.ozon.fintech.ui.storyprogress.StoryProgressState#default")) {
                    View view45 = holder.itemView;
                    Intrinsics.g(view45, "null cannot be cast to non-null type ru.ozon.fintech.ui.storyprogress.StoryProgressView");
                    ((StoryProgressView) view45).bindState((StoryProgressState) item);
                    break;
                }
                break;
            case -670355821:
                if (state.equals("ru.ozon.fintech.ui.imageV20.FinImageV20State#ru.ozon.fintech.ui.imageV20.FinImageV20View")) {
                    View view46 = holder.itemView;
                    Intrinsics.g(view46, "null cannot be cast to non-null type ru.ozon.fintech.ui.imageV20.FinImageV20View");
                    ((FinImageV20View) view46).bindState((FinImageV20State) item);
                    break;
                }
                break;
            case -666533840:
                if (state.equals("ru.ozon.fintech.ui.pdf.PdfPreviewListItem#ru.ozon.fintech.ui.pdf.PdfPreviewListItemView")) {
                    View view47 = holder.itemView;
                    Intrinsics.g(view47, "null cannot be cast to non-null type ru.ozon.fintech.ui.pdf.PdfPreviewListItemView");
                    ((PdfPreviewListItemView) view47).bind((PdfPreviewListItem) item);
                    break;
                }
                break;
            case -601119472:
                if (state.equals("ru.ozon.fintech.ui.radio.RadioWrapperState#default")) {
                    View view48 = holder.itemView;
                    Intrinsics.g(view48, "null cannot be cast to non-null type ru.ozon.fintech.ui.radio.RadioWrapperView");
                    ((RadioWrapperView) view48).bindState((RadioWrapperState) item);
                    break;
                }
                break;
            case -597852846:
                if (state.equals("ru.ozon.fintech.ui.button.large.FinLargeButtonState#default")) {
                    View view49 = holder.itemView;
                    Intrinsics.g(view49, "null cannot be cast to non-null type ru.ozon.fintech.ui.button.large.FinLargeButtonView");
                    ((FinLargeButtonView) view49).bindState((FinLargeButtonState) item);
                    break;
                }
                break;
            case -542104089:
                if (state.equals("ru.ozon.fintech.ui.separator.SeparatorState#default")) {
                    View view50 = holder.itemView;
                    Intrinsics.g(view50, "null cannot be cast to non-null type ru.ozon.fintech.ui.separator.SeparatorView");
                    ((SeparatorView) view50).bindState((SeparatorState) item);
                    break;
                }
                break;
            case -494422988:
                if (state.equals("ru.ozon.fintech.ui.snackbar.FinSnackbarState#default")) {
                    View view51 = holder.itemView;
                    Intrinsics.g(view51, "null cannot be cast to non-null type ru.ozon.fintech.ui.snackbar.FinSnackbarView");
                    ((FinSnackbarView) view51).bindState((FinSnackbarState) item);
                    break;
                }
                break;
            case -483356461:
                if (state.equals("ru.ozon.fintech.ui.imageV2.FinImageV2State#ru.ozon.fintech.ui.imageV2.FinImageV2View")) {
                    View view52 = holder.itemView;
                    Intrinsics.g(view52, "null cannot be cast to non-null type ru.ozon.fintech.ui.imageV2.FinImageV2View");
                    ((FinImageV2View) view52).bindState((FinImageV2State) item);
                    break;
                }
                break;
            case -463039095:
                if (state.equals("ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20State#default")) {
                    View view53 = holder.itemView;
                    Intrinsics.g(view53, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View");
                    ((LazyRowV20View) view53).bindState((LazyRowV20State) item);
                    break;
                }
                break;
            case -372269679:
                if (state.equals("ru.ozon.fintech.ui.button.small.FinSmallButtonState#ru.ozon.fintech.ui.button.small.FinSmallButtonView")) {
                    View view54 = holder.itemView;
                    Intrinsics.g(view54, "null cannot be cast to non-null type ru.ozon.fintech.ui.button.small.FinSmallButtonView");
                    ((FinSmallButtonView) view54).bindState((FinSmallButtonState) item);
                    break;
                }
                break;
            case -362129291:
                if (state.equals("ru.ozon.fintech.ui.menuitem.MenuItemState#default")) {
                    View view55 = holder.itemView;
                    Intrinsics.g(view55, "null cannot be cast to non-null type ru.ozon.fintech.ui.menuitem.MenuItemView");
                    ((MenuItemView) view55).bindState((MenuItemState) item);
                    break;
                }
                break;
            case -229015007:
                if (state.equals("ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressState#default")) {
                    View view56 = holder.itemView;
                    Intrinsics.g(view56, "null cannot be cast to non-null type ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView");
                    ((HorizontalProgressView) view56).bindState((HorizontalProgressState) item);
                    break;
                }
                break;
            case -212799886:
                if (state.equals("ru.ozon.fintech.ui.container.RecyclerContainerItem#default")) {
                    View view57 = holder.itemView;
                    Intrinsics.g(view57, "null cannot be cast to non-null type ru.ozon.fintech.ui.container.RecyclerContainerItemView");
                    ((RecyclerContainerItemView) view57).bindState((RecyclerContainerItem) item);
                    break;
                }
                break;
            case -128496397:
                if (state.equals("ru.ozon.fintech.ui.box20.BoxV20State#ru.ozon.fintech.ui.box20.BoxV20View")) {
                    View view58 = holder.itemView;
                    Intrinsics.g(view58, "null cannot be cast to non-null type ru.ozon.fintech.ui.box20.BoxV20View");
                    ((BoxV20View) view58).bindState((BoxV20State) item);
                    break;
                }
                break;
            case 10981835:
                if (state.equals("ru.ozon.fintech.ui.smalllabel.SmallLabelState#ru.ozon.fintech.ui.smalllabel.SmallLabelView")) {
                    View view59 = holder.itemView;
                    Intrinsics.g(view59, "null cannot be cast to non-null type ru.ozon.fintech.ui.smalllabel.SmallLabelView");
                    ((SmallLabelView) view59).bindState((SmallLabelState) item);
                    break;
                }
                break;
            case 22606997:
                if (state.equals("ru.ozon.fintech.ui.rowV20.RowV20State#default")) {
                    View view60 = holder.itemView;
                    Intrinsics.g(view60, "null cannot be cast to non-null type ru.ozon.fintech.ui.rowV20.RowV20View");
                    ((RowV20View) view60).bindState((RowV20State) item);
                    break;
                }
                break;
            case 26114678:
                if (state.equals("ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState#default")) {
                    View view61 = holder.itemView;
                    Intrinsics.g(view61, "null cannot be cast to non-null type ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView");
                    ((CheckBoxWrapperView) view61).bindState((CheckBoxWrapperState) item);
                    break;
                }
                break;
            case 29445579:
                if (state.equals("ru.ozon.fintech.ui.rowV20.RowV20State#ru.ozon.fintech.ui.rowV20.RowV20View")) {
                    View view62 = holder.itemView;
                    Intrinsics.g(view62, "null cannot be cast to non-null type ru.ozon.fintech.ui.rowV20.RowV20View");
                    ((RowV20View) view62).bindState((RowV20State) item);
                    break;
                }
                break;
            case 50617493:
                if (state.equals("ru.ozon.fintech.ui.smalllabel.SmallLabelState#default")) {
                    View view63 = holder.itemView;
                    Intrinsics.g(view63, "null cannot be cast to non-null type ru.ozon.fintech.ui.smalllabel.SmallLabelView");
                    ((SmallLabelView) view63).bindState((SmallLabelState) item);
                    break;
                }
                break;
            case 60302670:
                if (state.equals("ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState#ru.ozon.fintech.ui.pinprogress.PinProgressWrapper")) {
                    View view64 = holder.itemView;
                    Intrinsics.g(view64, "null cannot be cast to non-null type ru.ozon.fintech.ui.pinprogress.PinProgressWrapper");
                    ((PinProgressWrapper) view64).bindState((PinProgressWrapperState) item);
                    break;
                }
                break;
            case 102383862:
                if (state.equals("ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState#default")) {
                    View view65 = holder.itemView;
                    Intrinsics.g(view65, "null cannot be cast to non-null type ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapper");
                    ((AnimatedCircleProgressWrapper) view65).bindState((AnimatedCircleProgressWrapperState) item);
                    break;
                }
                break;
            case 111878165:
                if (state.equals("ru.ozon.fintech.ui.action.ActionTextItemState#default")) {
                    View view66 = holder.itemView;
                    Intrinsics.g(view66, "null cannot be cast to non-null type ru.ozon.fintech.ui.action.ActionTextItemView");
                    ((ActionTextItemView) view66).bindState((ActionTextItemState) item);
                    break;
                }
                break;
            case 286007219:
                if (state.equals("ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State#ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22View")) {
                    View view67 = holder.itemView;
                    Intrinsics.g(view67, "null cannot be cast to non-null type ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22View");
                    ((ButtonAtomWrapperV22View) view67).bindState((ButtonAtomWrapperV22State) item);
                    break;
                }
                break;
            case 328161288:
                if (state.equals("ru.ozon.fintech.ui.header.HeaderItem#ru.ozon.fintech.ui.header.HeaderItemView")) {
                    View view68 = holder.itemView;
                    Intrinsics.g(view68, "null cannot be cast to non-null type ru.ozon.fintech.ui.header.HeaderItemView");
                    ((HeaderItemView) view68).bindState((HeaderItem) item);
                    break;
                }
                break;
            case 434862483:
                if (state.equals("ru.ozon.fintech.ui.lottie.FinLottieState#ru.ozon.fintech.ui.lottie.FinLottieView")) {
                    View view69 = holder.itemView;
                    Intrinsics.g(view69, "null cannot be cast to non-null type ru.ozon.fintech.ui.lottie.FinLottieView");
                    ((FinLottieView) view69).bindState((FinLottieState) item);
                    break;
                }
                break;
            case 483682582:
                if (state.equals("ru.ozon.fintech.ui.textatom.TextAtomWrapperState#default")) {
                    View view70 = holder.itemView;
                    Intrinsics.g(view70, "null cannot be cast to non-null type ru.ozon.fintech.ui.textatom.TextAtomWrapperView");
                    ((TextAtomWrapperView) view70).bindState((TextAtomWrapperState) item);
                    break;
                }
                break;
            case 491484519:
                if (state.equals("ru.ozon.fintech.ui.lottieV20.LottieV20State#ru.ozon.fintech.ui.lottieV20.LottieV20View")) {
                    View view71 = holder.itemView;
                    Intrinsics.g(view71, "null cannot be cast to non-null type ru.ozon.fintech.ui.lottieV20.LottieV20View");
                    ((LottieV20View) view71).bindState((LottieV20State) item);
                    break;
                }
                break;
            case 493023700:
                if (state.equals("ru.ozon.fintech.ui.textfield.TextFieldWrapperState#default")) {
                    View view72 = holder.itemView;
                    Intrinsics.g(view72, "null cannot be cast to non-null type ru.ozon.fintech.ui.textfield.TextFieldWrapperView");
                    ((TextFieldWrapperView) view72).bindState((TextFieldWrapperState) item);
                    break;
                }
                break;
            case 562029735:
                if (state.equals("ru.ozon.fintech.ui.separator.SeparatorState#ru.ozon.fintech.ui.separator.SeparatorView")) {
                    View view73 = holder.itemView;
                    Intrinsics.g(view73, "null cannot be cast to non-null type ru.ozon.fintech.ui.separator.SeparatorView");
                    ((SeparatorView) view73).bindState((SeparatorState) item);
                    break;
                }
                break;
            case 615729689:
                if (state.equals("ru.ozon.fintech.ui.row.lazyrow.LazyRowState#default")) {
                    View view74 = holder.itemView;
                    Intrinsics.g(view74, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.lazyrow.LazyRowView");
                    ((LazyRowView) view74).bindState((LazyRowState) item);
                    break;
                }
                break;
            case 635435987:
                if (state.equals("ru.ozon.fintech.ui.textatom.TextAtomWrapperState#ru.ozon.fintech.ui.textatom.TextAtomWrapperView")) {
                    View view75 = holder.itemView;
                    Intrinsics.g(view75, "null cannot be cast to non-null type ru.ozon.fintech.ui.textatom.TextAtomWrapperView");
                    ((TextAtomWrapperView) view75).bindState((TextAtomWrapperState) item);
                    break;
                }
                break;
            case 716773723:
                if (state.equals("ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State#default")) {
                    View view76 = holder.itemView;
                    Intrinsics.g(view76, "null cannot be cast to non-null type ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20View");
                    ((RoundProgressV20View) view76).bindState((RoundProgressV20State) item);
                    break;
                }
                break;
            case 770758869:
                if (state.equals("ru.ozon.fintech.ui.cardV2.CardV2State#default")) {
                    View view77 = holder.itemView;
                    Intrinsics.g(view77, "null cannot be cast to non-null type ru.ozon.fintech.ui.cardV2.CardV2View");
                    ((CardV2View) view77).bindState((CardV2State) item);
                    break;
                }
                break;
            case 774877366:
                if (state.equals("ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState#default")) {
                    View view78 = holder.itemView;
                    Intrinsics.g(view78, "null cannot be cast to non-null type ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView");
                    ((ToggleAtomWrapperView) view78).bindState((ToggleAtomWrapperState) item);
                    break;
                }
                break;
            case 835892307:
                if (state.equals("ru.ozon.fintech.ui.image.FinImageState#ru.ozon.fintech.ui.image.FinImageView")) {
                    View view79 = holder.itemView;
                    Intrinsics.g(view79, "null cannot be cast to non-null type ru.ozon.fintech.ui.image.FinImageView");
                    ((FinImageView) view79).bindState((FinImageState) item);
                    break;
                }
                break;
            case 842942388:
                if (state.equals("ru.ozon.fintech.ui.radioV20.RadioWrapperV20State#default")) {
                    View view80 = holder.itemView;
                    Intrinsics.g(view80, "null cannot be cast to non-null type ru.ozon.fintech.ui.radioV20.RadioWrapperV20View");
                    ((RadioWrapperV20View) view80).bindState((RadioWrapperV20State) item);
                    break;
                }
                break;
            case 895522446:
                if (state.equals("ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapperState#ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapper")) {
                    View view81 = holder.itemView;
                    Intrinsics.g(view81, "null cannot be cast to non-null type ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapper");
                    ((AnimatedCircleProgressWrapper) view81).bindState((AnimatedCircleProgressWrapperState) item);
                    break;
                }
                break;
            case 920249259:
                if (state.equals("ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22State#default")) {
                    View view82 = holder.itemView;
                    Intrinsics.g(view82, "null cannot be cast to non-null type ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22View");
                    ((ButtonAtomWrapperV22View) view82).bindState((ButtonAtomWrapperV22State) item);
                    break;
                }
                break;
            case 927807827:
                if (state.equals("ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState#ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView")) {
                    View view83 = holder.itemView;
                    Intrinsics.g(view83, "null cannot be cast to non-null type ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView");
                    ((TextAtomV2WrapperView) view83).bindState((TextAtomV2WrapperState) item);
                    break;
                }
                break;
            case 953975336:
                if (state.equals("ru.ozon.fintech.ui.container.RecyclerContainerItem#ru.ozon.fintech.ui.container.RecyclerContainerItemView")) {
                    View view84 = holder.itemView;
                    Intrinsics.g(view84, "null cannot be cast to non-null type ru.ozon.fintech.ui.container.RecyclerContainerItemView");
                    ((RecyclerContainerItemView) view84).bindState((RecyclerContainerItem) item);
                    break;
                }
                break;
            case 969936851:
                if (state.equals("ru.ozon.fintech.ui.checkbox.CheckBoxWrapperState#ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView")) {
                    View view85 = holder.itemView;
                    Intrinsics.g(view85, "null cannot be cast to non-null type ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView");
                    ((CheckBoxWrapperView) view85).bindState((CheckBoxWrapperState) item);
                    break;
                }
                break;
            case 992313299:
                if (state.equals("ru.ozon.fintech.ui.radio.RadioWrapperState#ru.ozon.fintech.ui.radio.RadioWrapperView")) {
                    View view86 = holder.itemView;
                    Intrinsics.g(view86, "null cannot be cast to non-null type ru.ozon.fintech.ui.radio.RadioWrapperView");
                    ((RadioWrapperView) view86).bindState((RadioWrapperState) item);
                    break;
                }
                break;
            case 1004952925:
                if (state.equals("ru.ozon.fintech.ui.horizontalthree.HorizontalThreeState#default")) {
                    View view87 = holder.itemView;
                    Intrinsics.g(view87, "null cannot be cast to non-null type ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView");
                    ((HorizontalThreeView) view87).bindState((HorizontalThreeState) item);
                    break;
                }
                break;
            case 1030018328:
                if (state.equals("ru.ozon.fintech.ui.input.FinInputState#default")) {
                    View view88 = holder.itemView;
                    Intrinsics.g(view88, "null cannot be cast to non-null type ru.ozon.fintech.ui.input.FinInputView");
                    ((FinInputView) view88).bindState((FinInputState) item);
                    break;
                }
                break;
            case 1034119669:
                if (state.equals("ru.ozon.fintech.ui.pdf.PdfPreviewListItem#default")) {
                    View view89 = holder.itemView;
                    Intrinsics.g(view89, "null cannot be cast to non-null type ru.ozon.fintech.ui.pdf.PdfPreviewListItemView");
                    ((PdfPreviewListItemView) view89).bind((PdfPreviewListItem) item);
                    break;
                }
                break;
            case 1063357846:
                if (state.equals("ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperState#default")) {
                    View view90 = holder.itemView;
                    Intrinsics.g(view90, "null cannot be cast to non-null type ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView");
                    ((TextAtomV2WrapperView) view90).bindState((TextAtomV2WrapperState) item);
                    break;
                }
                break;
            case 1078134707:
                if (state.equals("ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20State#ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20View")) {
                    View view91 = holder.itemView;
                    Intrinsics.g(view91, "null cannot be cast to non-null type ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20View");
                    ((ButtonAtomWrapperV20View) view91).bindState((ButtonAtomWrapperV20State) item);
                    break;
                }
                break;
            case 1208725515:
                if (state.equals("ru.ozon.fintech.ui.menuitem.MenuItemState#ru.ozon.fintech.ui.menuitem.MenuItemView")) {
                    View view92 = holder.itemView;
                    Intrinsics.g(view92, "null cannot be cast to non-null type ru.ozon.fintech.ui.menuitem.MenuItemView");
                    ((MenuItemView) view92).bindState((MenuItemState) item);
                    break;
                }
                break;
            case 1283638603:
                if (state.equals("ru.ozon.fintech.ui.card.CardState#ru.ozon.fintech.ui.card.CardView")) {
                    View view93 = holder.itemView;
                    Intrinsics.g(view93, "null cannot be cast to non-null type ru.ozon.fintech.ui.card.CardView");
                    ((CardView) view93).bindState((CardState) item);
                    break;
                }
                break;
            case 1354193693:
                if (state.equals("ru.ozon.fintech.ui.row.verticalrow.VerticalRowState#default")) {
                    View view94 = holder.itemView;
                    Intrinsics.g(view94, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.verticalrow.VerticalRowView");
                    ((VerticalRowView) view94).bindState((VerticalRowState) item);
                    break;
                }
                break;
            case 1417745525:
                if (state.equals("ru.ozon.fintech.ui.lazycolumn.LazyColumnState#default")) {
                    View view95 = holder.itemView;
                    Intrinsics.g(view95, "null cannot be cast to non-null type ru.ozon.fintech.ui.lazycolumn.LazyColumnView");
                    ((LazyColumnView) view95).bindState((LazyColumnState) item);
                    break;
                }
                break;
            case 1442391371:
                if (state.equals("ru.ozon.fintech.ui.cardV2.CardV2State#ru.ozon.fintech.ui.cardV2.CardV2View")) {
                    View view96 = holder.itemView;
                    Intrinsics.g(view96, "null cannot be cast to non-null type ru.ozon.fintech.ui.cardV2.CardV2View");
                    ((CardV2View) view96).bindState((CardV2State) item);
                    break;
                }
                break;
            case 1465383955:
                if (state.equals("ru.ozon.fintech.ui.radioV20.RadioWrapperV20State#ru.ozon.fintech.ui.radioV20.RadioWrapperV20View")) {
                    View view97 = holder.itemView;
                    Intrinsics.g(view97, "null cannot be cast to non-null type ru.ozon.fintech.ui.radioV20.RadioWrapperV20View");
                    ((RadioWrapperV20View) view97).bindState((RadioWrapperV20State) item);
                    break;
                }
                break;
            case 1482184611:
                if (state.equals("ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20State#ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20View")) {
                    View view98 = holder.itemView;
                    Intrinsics.g(view98, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20View");
                    ((FlexRowV20View) view98).bindState((FlexRowV20State) item);
                    break;
                }
                break;
            case 1495303611:
                if (state.equals("ru.ozon.fintech.ui.row.verticalrow.VerticalRowState#ru.ozon.fintech.ui.row.verticalrow.VerticalRowView")) {
                    View view99 = holder.itemView;
                    Intrinsics.g(view99, "null cannot be cast to non-null type ru.ozon.fintech.ui.row.verticalrow.VerticalRowView");
                    ((VerticalRowView) view99).bindState((VerticalRowState) item);
                    break;
                }
                break;
            case 1508133579:
                if (state.equals("ru.ozon.fintech.ui.action.ActionTextItemState#ru.ozon.fintech.ui.action.ActionTextItemView")) {
                    View view100 = holder.itemView;
                    Intrinsics.g(view100, "null cannot be cast to non-null type ru.ozon.fintech.ui.action.ActionTextItemView");
                    ((ActionTextItemView) view100).bindState((ActionTextItemState) item);
                    break;
                }
                break;
            case 1509479363:
                if (state.equals("ru.ozon.fintech.ui.textareaV22.TextAreaV22State#ru.ozon.fintech.ui.textareaV22.TextAreaV22View")) {
                    View view101 = holder.itemView;
                    Intrinsics.g(view101, "null cannot be cast to non-null type ru.ozon.fintech.ui.textareaV22.TextAreaV22View");
                    ((TextAreaV22View) view101).bindState((TextAreaV22State) item);
                    break;
                }
                break;
            case 1518580683:
                if (state.equals("ru.ozon.fintech.ui.actionV2.ActionTextItemV2State#ru.ozon.fintech.ui.actionV2.ActionTextItemV2View")) {
                    View view102 = holder.itemView;
                    Intrinsics.g(view102, "null cannot be cast to non-null type ru.ozon.fintech.ui.actionV2.ActionTextItemV2View");
                    ((ActionTextItemV2View) view102).bindState((ActionTextItemV2State) item);
                    break;
                }
                break;
            case 1704798387:
                if (state.equals("ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20State#ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20View")) {
                    View view103 = holder.itemView;
                    Intrinsics.g(view103, "null cannot be cast to non-null type ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20View");
                    ((RoundProgressV20View) view103).bindState((RoundProgressV20State) item);
                    break;
                }
                break;
            case 1825743736:
                if (state.equals("ru.ozon.fintech.ui.imageV2.FinImageV2State#default")) {
                    View view104 = holder.itemView;
                    Intrinsics.g(view104, "null cannot be cast to non-null type ru.ozon.fintech.ui.imageV2.FinImageV2View");
                    ((FinImageV2View) view104).bindState((FinImageV2State) item);
                    break;
                }
                break;
            case 1855095315:
                if (state.equals("ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperState#ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView")) {
                    View view105 = holder.itemView;
                    Intrinsics.g(view105, "null cannot be cast to non-null type ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView");
                    ((TextAtomV20WrapperView) view105).bindState((TextAtomV20WrapperState) item);
                    break;
                }
                break;
            case 1862182297:
                if (state.equals("ru.ozon.fintech.ui.textareaV22.TextAreaV22State#default")) {
                    View view106 = holder.itemView;
                    Intrinsics.g(view106, "null cannot be cast to non-null type ru.ozon.fintech.ui.textareaV22.TextAreaV22View");
                    ((TextAreaV22View) view106).bindState((TextAreaV22State) item);
                    break;
                }
                break;
            case 1897984757:
                if (state.equals("ru.ozon.fintech.ui.qrcode.QrCodeState#default")) {
                    View view107 = holder.itemView;
                    Intrinsics.g(view107, "null cannot be cast to non-null type ru.ozon.fintech.ui.qrcode.QrCodeView");
                    ((QrCodeView) view107).bindState((QrCodeState) item);
                    break;
                }
                break;
            case 1908614555:
                if (state.equals("ru.ozon.fintech.ui.promoV2.PromoV2State#default")) {
                    View view108 = holder.itemView;
                    Intrinsics.g(view108, "null cannot be cast to non-null type ru.ozon.fintech.ui.promoV2.PromoV2View");
                    ((PromoV2View) view108).bindState((PromoV2State) item);
                    break;
                }
                break;
            case 1942248683:
                if (state.equals("ru.ozon.fintech.ui.thumb.ThumbState#ru.ozon.fintech.ui.thumb.ThumbView")) {
                    View view109 = holder.itemView;
                    Intrinsics.g(view109, "null cannot be cast to non-null type ru.ozon.fintech.ui.thumb.ThumbView");
                    ((ThumbView) view109).bindState((ThumbState) item);
                    break;
                }
                break;
            case 1954957266:
                if (state.equals("ru.ozon.fintech.ui.button.small.FinSmallButtonState#default")) {
                    View view110 = holder.itemView;
                    Intrinsics.g(view110, "null cannot be cast to non-null type ru.ozon.fintech.ui.button.small.FinSmallButtonView");
                    ((FinSmallButtonView) view110).bindState((FinSmallButtonState) item);
                    break;
                }
                break;
            case 1960851998:
                if (state.equals("ru.ozon.fintech.ui.textareaV20.TextAreaWrapperState#default")) {
                    View view111 = holder.itemView;
                    Intrinsics.g(view111, "null cannot be cast to non-null type ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView");
                    ((TextAreaWrapperView) view111).bindState((TextAreaWrapperState) item);
                    break;
                }
                break;
            case 1962654713:
                if (state.equals("ru.ozon.fintech.ui.textareaV20.TextAreaWrapperState#ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView")) {
                    View view112 = holder.itemView;
                    Intrinsics.g(view112, "null cannot be cast to non-null type ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView");
                    ((TextAreaWrapperView) view112).bindState((TextAreaWrapperState) item);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, ru.ozon.fintech.ui.columnV20.ColumnV20View] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, ru.ozon.fintech.ui.imageV20.FinImageV20View] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, ru.ozon.fintech.ui.pdf.PdfPreviewListItemView] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, ru.ozon.fintech.ui.qrcode.QrCodeView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, ru.ozon.fintech.ui.rowV20.RowV20View] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, ru.ozon.fintech.ui.textatom.TextAtomWrapperView] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, ru.ozon.fintech.ui.button.small.FinSmallButtonView] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, ru.ozon.fintech.ui.row.verticalrow.VerticalRowView] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, ru.ozon.fintech.ui.textareaV22.TextAreaV22View] */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, ru.ozon.fintech.ui.thumb.ThumbView] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, ru.ozon.fintech.ui.imageV2.FinImageV2View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, ru.ozon.fintech.ui.menuitem.MenuItemView] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, ru.ozon.fintech.ui.promoV2.PromoV2View] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, ru.ozon.fintech.ui.button.large.FinLargeButtonView] */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, ru.ozon.fintech.ui.promo.PromoView] */
    /* JADX WARN: Type inference failed for: r3v15, types: [T, ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View] */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, ru.ozon.fintech.ui.textareaV20.TextAreaWrapperView] */
    /* JADX WARN: Type inference failed for: r3v21, types: [T, ru.ozon.fintech.ui.textfieldV20.input.InputV20WrapperView] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, ru.ozon.fintech.ui.cardV2.CardV2View] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, ru.ozon.fintech.ui.image.FinImageView] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, ru.ozon.fintech.ui.lottieV20.LottieV20View] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, ru.ozon.fintech.ui.box20.BoxV20View] */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, ru.ozon.fintech.ui.lottie.FinLottieView] */
    /* JADX WARN: Type inference failed for: r4v16, types: [T, ru.ozon.fintech.ui.progress.roundV20.RoundProgressV20View] */
    /* JADX WARN: Type inference failed for: r4v20, types: [T, ru.ozon.fintech.ui.row.lazyrow.LazyRowView] */
    /* JADX WARN: Type inference failed for: r4v24, types: [T, ru.ozon.fintech.ui.storyprogress.StoryProgressView] */
    /* JADX WARN: Type inference failed for: r4v28, types: [T, ru.ozon.fintech.ui.textfieldV20.TextFieldV20WrapperView] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, ru.ozon.fintech.ui.card.CardView] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, ru.ozon.fintech.ui.iconcard.IconCardView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressWrapper] */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView] */
    /* JADX WARN: Type inference failed for: r5v15, types: [T, ru.ozon.fintech.ui.lazycolumn.LazyColumnView] */
    /* JADX WARN: Type inference failed for: r5v20, types: [T, ru.ozon.fintech.ui.progress.horizontalV20.HorizontalProgressV20View] */
    /* JADX WARN: Type inference failed for: r5v25, types: [T, ru.ozon.fintech.ui.row.flexrowV20.FlexRowV20View] */
    /* JADX WARN: Type inference failed for: r5v30, types: [T, ru.ozon.fintech.ui.snackbar.FinSnackbarView] */
    /* JADX WARN: Type inference failed for: r5v35, types: [T, ru.ozon.fintech.ui.textfield.TextFieldWrapperView] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, ru.ozon.fintech.ui.actionV2.ActionTextItemV2View] */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, ru.ozon.fintech.ui.header.HeaderItemView] */
    /* JADX WARN: Type inference failed for: r6v18, types: [T, ru.ozon.fintech.ui.labelV20.LabelV20WrapperView] */
    /* JADX WARN: Type inference failed for: r6v24, types: [T, ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressView] */
    /* JADX WARN: Type inference failed for: r6v30, types: [T, ru.ozon.fintech.ui.radioV20.RadioWrapperV20View] */
    /* JADX WARN: Type inference failed for: r6v36, types: [T, ru.ozon.fintech.ui.smalllabel.SmallLabelView] */
    /* JADX WARN: Type inference failed for: r6v42, types: [T, ru.ozon.fintech.ui.textatomV20.TextAtomV20WrapperView] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, ru.ozon.fintech.ui.buttonV22.ButtonAtomWrapperV22View] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, ru.ozon.fintech.ui.action.ActionTextItemView] */
    /* JADX WARN: Type inference failed for: r7v12, types: [T, ru.ozon.fintech.ui.container.RecyclerContainerItemView] */
    /* JADX WARN: Type inference failed for: r7v18, types: [T, ru.ozon.fintech.ui.input.FinInputView] */
    /* JADX WARN: Type inference failed for: r7v24, types: [T, ru.ozon.fintech.ui.pinprogress.PinProgressWrapper] */
    /* JADX WARN: Type inference failed for: r7v30, types: [T, ru.ozon.fintech.ui.radio.RadioWrapperView] */
    /* JADX WARN: Type inference failed for: r7v36, types: [T, ru.ozon.fintech.ui.separator.SeparatorView] */
    /* JADX WARN: Type inference failed for: r7v42, types: [T, ru.ozon.fintech.ui.textatomV2.TextAtomV2WrapperView] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, ru.ozon.fintech.ui.buttonV20.ButtonAtomWrapperV20View] */
    @Override // com.detmir.recycli.adapters.RecyclerBinder
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final M m11 = new M();
        switch (viewType) {
            case 0:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                m11.f71787a = new ActionTextItemView(context, null, 0, 6, null);
                break;
            case 1:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                m11.f71787a = new ActionTextItemV2View(context2, null, 0, 6, null);
                break;
            case 2:
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                m11.f71787a = new AnimatedCircleProgressWrapper(context3, null, 0, 6, null);
                break;
            case 3:
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                m11.f71787a = new BoxV20View(context4, null, 0, 6, null);
                break;
            case 4:
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                m11.f71787a = new FinLargeButtonView(context5, null, 0, 6, null);
                break;
            case 5:
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                m11.f71787a = new FinSmallButtonView(context6, null, 0, 6, null);
                break;
            case 6:
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                m11.f71787a = new FinSwitchItemView(context7, null, 0, 6, null);
                break;
            case 7:
                Context context8 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                m11.f71787a = new ButtonAtomWrapperV20View(context8, null, 0, 6, null);
                break;
            case 8:
                Context context9 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                m11.f71787a = new ButtonAtomWrapperV22View(context9, null, 0, 6, null);
                break;
            case 9:
                Context context10 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                m11.f71787a = new ButtonAtomWrapperView(context10, null, 0, 6, null);
                break;
            case 10:
                Context context11 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                m11.f71787a = new CardView(context11, null, 0, 6, null);
                break;
            case 11:
                Context context12 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                m11.f71787a = new CardV2View(context12, null, 0, 6, null);
                break;
            case 12:
                Context context13 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                m11.f71787a = new CheckBoxWrapperView(context13, null, 0, 6, null);
                break;
            case 13:
                Context context14 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                m11.f71787a = new ColumnV20View(context14, null, 0, 6, null);
                break;
            case 14:
                Context context15 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                m11.f71787a = new RecyclerContainerItemView(context15, null, 0, 6, null);
                break;
            case 15:
                Context context16 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
                m11.f71787a = new HeaderItemView(context16, null, 0, 6, null);
                break;
            case 16:
                Context context17 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
                m11.f71787a = new HorizontalThreeView(context17, null, 0, 6, null);
                break;
            case 17:
                Context context18 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
                m11.f71787a = new IconCardView(context18, null, 0, 6, null);
                break;
            case 18:
                Context context19 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
                m11.f71787a = new FinImageView(context19, null, 0, 6, null);
                break;
            case 19:
                Context context20 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
                m11.f71787a = new FinImageV2View(context20, null, 0, 6, null);
                break;
            case 20:
                Context context21 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
                m11.f71787a = new FinImageV20View(context21, null, 0, 6, null);
                break;
            case 21:
                Context context22 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
                m11.f71787a = new FinInputView(context22, null, 0, 6, null);
                break;
            case 22:
                Context context23 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
                m11.f71787a = new LabelV20WrapperView(context23, null, 0, 6, null);
                break;
            case 23:
                Context context24 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
                m11.f71787a = new LazyColumnView(context24, null, 0, 6, null);
                break;
            case 24:
                Context context25 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
                m11.f71787a = new FinLottieView(context25, null, 0, 6, null);
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                Context context26 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context26, "getContext(...)");
                m11.f71787a = new LottieV20View(context26, null, 0, 6, null);
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                Context context27 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context27, "getContext(...)");
                m11.f71787a = new MenuItemView(context27, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Context context28 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context28, "getContext(...)");
                m11.f71787a = new PdfPreviewListItemView(context28, null, 0, 6, null);
                break;
            case 28:
                Context context29 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context29, "getContext(...)");
                m11.f71787a = new PinProgressWrapper(context29, null, 0, 6, null);
                break;
            case 29:
                Context context30 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context30, "getContext(...)");
                m11.f71787a = new HorizontalProgressView(context30, null, 0, 6, null);
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                Context context31 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context31, "getContext(...)");
                m11.f71787a = new HorizontalProgressV20View(context31, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                Context context32 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context32, "getContext(...)");
                m11.f71787a = new RoundProgressV20View(context32, null, 0, 6, null);
                break;
            case 32:
                Context context33 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context33, "getContext(...)");
                m11.f71787a = new PromoView(context33, null, 0, 6, null);
                break;
            case 33:
                Context context34 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context34, "getContext(...)");
                m11.f71787a = new PromoV2View(context34, null, 0, 6, null);
                break;
            case 34:
                Context context35 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context35, "getContext(...)");
                m11.f71787a = new QrCodeView(context35, null, 0, 6, null);
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                Context context36 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context36, "getContext(...)");
                m11.f71787a = new RadioWrapperView(context36, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                Context context37 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context37, "getContext(...)");
                m11.f71787a = new RadioWrapperV20View(context37, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                Context context38 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context38, "getContext(...)");
                m11.f71787a = new FlexRowV20View(context38, null, 0, 6, null);
                break;
            case 38:
                Context context39 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context39, "getContext(...)");
                m11.f71787a = new LazyRowView(context39, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                Context context40 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context40, "getContext(...)");
                m11.f71787a = new LazyRowV20View(context40, null, 0, 6, null);
                break;
            case 40:
                Context context41 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context41, "getContext(...)");
                m11.f71787a = new VerticalRowView(context41, null, 0, 6, null);
                break;
            case 41:
                Context context42 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context42, "getContext(...)");
                m11.f71787a = new RowV20View(context42, null, 0, 6, null);
                break;
            case 42:
                Context context43 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context43, "getContext(...)");
                m11.f71787a = new SeparatorView(context43, null, 0, 6, null);
                break;
            case 43:
                Context context44 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context44, "getContext(...)");
                m11.f71787a = new SmallLabelView(context44, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                Context context45 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context45, "getContext(...)");
                m11.f71787a = new FinSnackbarView(context45, null, 0, 6, null);
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Context context46 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context46, "getContext(...)");
                m11.f71787a = new StoryProgressView(context46, null, 0, 6, null);
                break;
            case 46:
                Context context47 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context47, "getContext(...)");
                m11.f71787a = new TextAreaWrapperView(context47, null, 0, 6, null);
                break;
            case 47:
                Context context48 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context48, "getContext(...)");
                m11.f71787a = new TextAreaV22View(context48, null, 0, 6, null);
                break;
            case 48:
                Context context49 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context49, "getContext(...)");
                m11.f71787a = new TextAtomWrapperView(context49, null, 0, 6, null);
                break;
            case 49:
                Context context50 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context50, "getContext(...)");
                m11.f71787a = new TextAtomV2WrapperView(context50, null, 0, 6, null);
                break;
            case 50:
                Context context51 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context51, "getContext(...)");
                m11.f71787a = new TextAtomV20WrapperView(context51, null, 0, 6, null);
                break;
            case 51:
                Context context52 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context52, "getContext(...)");
                m11.f71787a = new TextFieldWrapperView(context52, null, 0, 6, null);
                break;
            case 52:
                Context context53 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context53, "getContext(...)");
                m11.f71787a = new TextFieldV20WrapperView(context53, null, 0, 6, null);
                break;
            case 53:
                Context context54 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context54, "getContext(...)");
                m11.f71787a = new InputV20WrapperView(context54, null, 0, 6, null);
                break;
            case 54:
                Context context55 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context55, "getContext(...)");
                m11.f71787a = new ThumbView(context55, null, 0, 6, null);
                break;
            case 55:
                Context context56 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context56, "getContext(...)");
                m11.f71787a = new ToggleAtomWrapperView(context56, null, 0, 6, null);
                break;
            default:
                throw new Exception("Recyclii can't find view for a RecyclerItem");
        }
        if (m11.f71787a != 0) {
            return new RecyclerView.C(m11) { // from class: ru.ozon.fintech.ui.RecyclerBinderImpl$onCreateViewHolder$1
                {
                    super(m11.f71787a);
                }
            };
        }
        final View view = new View(parent.getContext());
        return new RecyclerView.C(view) { // from class: ru.ozon.fintech.ui.RecyclerBinderImpl$onCreateViewHolder$2
        };
    }
}
