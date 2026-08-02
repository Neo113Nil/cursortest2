package ru.ozon.app.android.atoms.v3.holders.select;

import Sc.InterfaceC3999a;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.app.android.uikit.view.atoms.select.dialog.SelectModel;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0002R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/select/SelectAtomHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/list/Select;", "Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/select/SelectView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onOptionItemClick", "Lkotlin/Function1;", "", "", "onBind", "item", "toModel", "Lru/ozon/app/android/uikit/view/atoms/select/dialog/SelectModel;", "Lru/ozon/app/android/atoms/data/list/Select$Option;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectAtomHolder extends AtomV3<Select, SelectView> {

    @NotNull
    private final Function1<Integer, Unit> onOptionItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAtomHolder(@NotNull SelectView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        SelectAtomHolder$onOptionItemClick$1 selectAtomHolder$onOptionItemClick$1 = new SelectAtomHolder$onOptionItemClick$1(this);
        this.onOptionItemClick = selectAtomHolder$onOptionItemClick$1;
        getContainerView().setOnDialogItemClick(selectAtomHolder$onOptionItemClick$1);
    }

    private final SelectModel toModel(Select.Option option) {
        String name = option.getName();
        Boolean isSelected = option.isSelected();
        return new SelectModel(name, isSelected != null ? isSelected.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Select item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((SelectAtomHolder) item);
        SelectView containerView = getContainerView();
        containerView.setOnDialogItemClick(this.onOptionItemClick);
        containerView.setOnClickListenerDecorator(new SelectAtomHolder$onBind$1$1(this, item));
        List<Select.Option> options = item.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(toModel((Select.Option) it.next()));
        }
        containerView.bind(arrayList);
        String icon = item.getIcon();
        if (icon != null) {
            containerView.setIcon(icon);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectAtomHolder(@NotNull Context context, String str) {
        this(new SelectView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
