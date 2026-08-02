package ru.ozon.app.android.atoms.v3.holders.cells;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle;
import ru.ozon.app.android.atoms.utils.CharSequenceExtensionKt;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B#\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0013R\u0016\u0010\u0006\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellWithSubtitleHolder;", "DTO", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "View", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellHolder;", "containerView", "atomContext", "", "isSelect", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;Ljava/lang/String;Z)V", "getContainerView", "()Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "onBind", "", "item", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseCellWithSubtitleHolder<DTO extends CellAtom.CellAtomWithSubtitle, View extends BaseCellWithSubtitleView> extends BaseCellHolder<DTO, View> {

    @NotNull
    private final View containerView;
    private final boolean isSelect;

    public /* synthetic */ BaseCellWithSubtitleHolder(BaseCellWithSubtitleView baseCellWithSubtitleView, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseCellWithSubtitleView, str, (i11 & 4) != 0 ? false : z11);
    }

    protected void onBind(@NotNull DTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((BaseCellWithSubtitleHolder<DTO, View>) item);
        View containerView = getContainerView();
        CharSequence subtitle = item.getSubtitle();
        if (subtitle == null) {
            subtitle = null;
        } else if (this.isSelect) {
            subtitle = CharSequenceExtensionKt.addUnderlineToClickableSpans(subtitle);
        }
        containerView.setSubtitle(subtitle);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        OzonSpannableString subtitle2 = item.getSubtitle();
        boolean z11 = false;
        if (subtitle2 != null && OzonSpannableStringKt.hasClickableSpan(subtitle2)) {
            z11 = true;
        }
        containerView.setSubtitleMovementMethod(z11 ? linkMovementMethod : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setSubtitleTextColor(styleParser.parseColor(context, item.getSubtitleColor(), R$color.oz_semantic_text_primary), item.getColorDisabledAsEnabled());
        Integer maxLines = item.getMaxLines();
        if (maxLines != null) {
            containerView.setSubtitleMaxLines(maxLines.intValue());
        } else if (item.getAlign() == CellAtom.Align.ALIGN_TYPE_TOP) {
            containerView.resetSubtitleMaxLines();
        } else {
            containerView.setSubtitleMaxLines(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCellWithSubtitleHolder(@NotNull View containerView, String str, boolean z11) {
        super(containerView, str);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.isSelect = z11;
    }

    @Override // ru.ozon.app.android.atoms.v3.holders.cells.BaseCellHolder, ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    @NotNull
    public View getContainerView() {
        return this.containerView;
    }
}
