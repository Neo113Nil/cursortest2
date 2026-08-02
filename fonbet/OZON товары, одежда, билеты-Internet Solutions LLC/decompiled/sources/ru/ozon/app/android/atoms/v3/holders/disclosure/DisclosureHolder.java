package ru.ozon.app.android.atoms.v3.holders.disclosure;

import Cw.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/disclosure/DisclosureHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "toViewTheme", "Lru/ozon/app/android/uikit/view/atoms/disclosure/DisclosureView$Theme;", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom$Theme;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclosureHolder extends AtomV3<DisclosureAtom, DisclosureView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclosureAtom.Theme.values().length];
            try {
                iArr[DisclosureAtom.Theme.FRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureHolder(@NotNull DisclosureView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$0(DisclosureHolder disclosureHolder, View view) {
        AtomAction atomAction;
        DisclosureAtom disclosureAtom = (DisclosureAtom) disclosureHolder.getData();
        AtomActionDTO action = disclosureAtom.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, disclosureAtom.getTrackingInfo())) == null) {
            return;
        }
        disclosureHolder.handleAction(atomAction);
    }

    private final DisclosureView.Theme toViewTheme(DisclosureAtom.Theme theme) {
        return WhenMappings.$EnumSwitchMapping$0[theme.ordinal()] == 1 ? DisclosureView.Theme.FRESH : DisclosureView.Theme.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull DisclosureAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((DisclosureHolder) item);
        DisclosureView containerView = getContainerView();
        DisclosureView.Theme viewTheme = toViewTheme(item.getTheme());
        if (!Intrinsics.d(item.getText(), containerView.getText())) {
            containerView.setText(item.getText());
        }
        if (viewTheme != containerView.getTheme()) {
            containerView.setTheme(viewTheme);
        }
        containerView.setClickable(item.getAction() != null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclosureHolder(@NotNull Context context, String str) {
        this(new DisclosureView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
