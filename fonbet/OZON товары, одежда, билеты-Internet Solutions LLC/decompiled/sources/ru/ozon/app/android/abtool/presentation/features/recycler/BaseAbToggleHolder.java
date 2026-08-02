package ru.ozon.app.android.abtool.presentation.features.recycler;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\n*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/BaseAbToggleHolder;", "Lru/ozon/app/android/abtool/presentation/features/recycler/BaseHolder;", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "", "resId", "Landroid/view/ViewGroup;", "parent", "<init>", "(ILandroid/view/ViewGroup;)V", "item", "", "bind", "(Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;)V", "Landroid/content/Context;", "", "label", AppMeasurementSdk.ConditionalUserProperty.VALUE, "toClipboard", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "featureItem", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "getFeatureItem", "()Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "setFeatureItem", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseAbToggleHolder extends BaseHolder<FeatureItem> {
    private FeatureItem featureItem;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseAbToggleHolder(int i11, @NotNull ViewGroup parent) {
        super(r3);
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(i11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
    }

    public static /* synthetic */ void toClipboard$default(BaseAbToggleHolder baseAbToggleHolder, Context context, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toClipboard");
        }
        if ((i11 & 1) != 0) {
            str = "";
        }
        baseAbToggleHolder.toClipboard(context, str, str2);
    }

    public void bind(@NotNull FeatureItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.featureItem = item;
    }

    protected final FeatureItem getFeatureItem() {
        return this.featureItem;
    }

    protected final void toClipboard(@NotNull Context context, @NotNull String label, @NotNull String value) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null) {
            return;
        }
        ClipData newPlainText = ClipData.newPlainText(label, value);
        if (newPlainText != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        Toast.makeText(context, "Copied", 0).show();
    }
}
