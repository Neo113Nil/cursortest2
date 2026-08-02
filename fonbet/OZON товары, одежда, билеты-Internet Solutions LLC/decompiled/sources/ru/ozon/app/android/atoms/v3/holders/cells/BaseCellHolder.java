package ru.ozon.app.android.atoms.v3.holders.cells;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0019\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u0016\u0010\u0006\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/cells/BaseCellHolder;", "DTO", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", "View", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellView;", "Lru/ozon/uni/atoms/v3/AtomV3;", "containerView", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellView;Ljava/lang/String;)V", "getContainerView", "()Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellView;", "onBind", "", "item", "(Lru/ozon/app/android/atoms/data/cells/CellAtom;)V", "setTestId", "testId", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseCellHolder<DTO extends CellAtom, View extends BaseCellView> extends AtomV3<DTO, View> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellAtom.Align.values().length];
            try {
                iArr[CellAtom.Align.ALIGN_TYPE_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CellAtom.Align.ALIGN_TYPE_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCellHolder(@NotNull View containerView, String str) {
        super(containerView, str);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    protected void onBind(@NotNull DTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((BaseCellHolder<DTO, View>) item);
        View containerView = getContainerView();
        containerView.setTitle(item.getTitle());
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        if (!OzonSpannableStringKt.hasClickableSpan(item.getTitle())) {
            linkMovementMethod = null;
        }
        containerView.setTitleMovementMethod(linkMovementMethod);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setTitleTextColor(styleParser.parseColor(context, item.getTitleColor(), R$color.oz_black), item.getColorDisabledAsEnabled());
        containerView.hideSeparator(item.getHideSeparator());
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getAlign().ordinal()];
        if (i11 == 1) {
            containerView.alignActionViewTopVertical();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            containerView.alignActionViewCenterVertical();
        }
        Integer maxLines = item.getMaxLines();
        if (maxLines != null) {
            containerView.setTitleMaxLines(maxLines.intValue());
        } else if (item.getAlign() == CellAtom.Align.ALIGN_TYPE_TOP) {
            containerView.resetTitleMaxLines();
        } else {
            containerView.setTitleMaxLines(2);
        }
        containerView.setEnabled(item.getAction() != null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setTestId(testId);
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    @NotNull
    public View getContainerView() {
        return this.containerView;
    }
}
