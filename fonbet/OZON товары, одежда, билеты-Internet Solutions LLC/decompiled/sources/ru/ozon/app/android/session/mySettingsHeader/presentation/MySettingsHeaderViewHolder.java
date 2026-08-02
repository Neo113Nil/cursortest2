package ru.ozon.app.android.session.mySettingsHeader.presentation;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.R$drawable;
import ru.ozon.app.android.session.databinding.MySettingsHeaderBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/session/mySettingsHeader/presentation/MySettingsHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/mySettingsHeader/presentation/MySettingsHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/session/databinding/MySettingsHeaderBinding;", "binding", "<init>", "(Lru/ozon/app/android/session/databinding/MySettingsHeaderBinding;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/session/mySettingsHeader/presentation/MySettingsHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/session/databinding/MySettingsHeaderBinding;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MySettingsHeaderViewHolder extends k<MySettingsHeaderVO> {

    @NotNull
    private final MySettingsHeaderBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MySettingsHeaderViewHolder(@NotNull MySettingsHeaderBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MySettingsHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        MySettingsHeaderBinding mySettingsHeaderBinding = this.binding;
        mySettingsHeaderBinding.imageViewLogo.setImageResource(R$drawable.ic_ozon_id_logo_bx);
        TextAtomV2View text = mySettingsHeaderBinding.text;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        TextHolderKt.bind$default(text, item.getText(), null, 2, null);
    }
}
