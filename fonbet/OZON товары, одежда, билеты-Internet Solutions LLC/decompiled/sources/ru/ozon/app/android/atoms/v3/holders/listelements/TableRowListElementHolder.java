package ru.ozon.app.android.atoms.v3.holders.listelements;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.uikit.view.atoms.listelemets.TableRowListElementView;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/listelements/TableRowListElementHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$TableRowListElement;", "Lru/ozon/app/android/uikit/view/atoms/listelemets/TableRowListElementView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/listelemets/TableRowListElementView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TableRowListElementHolder extends AtomV3<ListElementAtom.TableRowListElement, TableRowListElementView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableRowListElementHolder(@NotNull TableRowListElementView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableRowListElementHolder(@NotNull Context context, String str) {
        this(new TableRowListElementView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ListElementAtom.TableRowListElement item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TableRowListElementHolder) item);
        TableRowListElementView containerView = getContainerView();
        containerView.setRightText(item.getTextRight());
        containerView.setLeftText(item.getTextLeft());
        containerView.setTextStyle(item.getTextStyle());
        containerView.setTextColor(item.getTextColor());
        containerView.showSeparator(item.getHasSeparator());
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        if (!OzonSpannableStringKt.hasClickableSpan(item.getTextLeft())) {
            linkMovementMethod = null;
        }
        containerView.setLeftMovementMethod(linkMovementMethod);
        containerView.setRightMovementMethod(OzonSpannableStringKt.hasClickableSpan(item.getTextRight()) ? LinkMovementMethod.getInstance() : null);
        containerView.setRightIcon(item.getRightIcon());
    }
}
