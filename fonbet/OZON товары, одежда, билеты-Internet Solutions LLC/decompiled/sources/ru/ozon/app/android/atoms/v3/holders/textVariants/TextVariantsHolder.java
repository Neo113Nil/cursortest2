package ru.ozon.app.android.atoms.v3.holders.textVariants;

import Sc.InterfaceC3999a;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.variants.TextVariants;
import ru.ozon.app.android.uikit.view.atoms.textVariants.TextVariantsView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/textVariants/TextVariantsHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/variants/TextVariants;", "Lru/ozon/app/android/uikit/view/atoms/textVariants/TextVariantsView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/textVariants/TextVariantsView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "onConfigureView", "configuration", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextVariantsHolder extends AtomV3<TextVariants, TextVariantsView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextVariantsHolder(@NotNull TextVariantsView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextVariantsHolder(@NotNull Context context, String str) {
        this(new TextVariantsView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TextVariants item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TextVariantsHolder) item);
        List<String> items = item.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        getContainerView().bind(arrayList);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Atom.DefaultConfigurator configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigureView((TextVariantsHolder) configuration);
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart(), getContext()), ResourceExtKt.toPx(configuration.getPaddingTop(), getContext()), ResourceExtKt.toPx(configuration.getPaddingEnd(), getContext()), ResourceExtKt.toPx(configuration.getPaddingBottom(), getContext()));
    }
}
