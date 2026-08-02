package ru.ozon.app.android.benchmark;

import android.os.Bundle;
import androidx.appcompat.app.g;
import kotlin.Metadata;
import ru.ozon.app.android.main.R$layout;
import ru.ozon.app.android.main.databinding.ActivityBenchmarkBinding;
import ru.ozon.app.android.uikit.R$style;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/benchmark/BenchmarkActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/main/databinding/ActivityBenchmarkBinding;", "_binding", "Lru/ozon/app/android/main/databinding/ActivityBenchmarkBinding;", "getBinding", "()Lru/ozon/app/android/main/databinding/ActivityBenchmarkBinding;", "binding", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BenchmarkActivity extends g {
    private ActivityBenchmarkBinding _binding;

    private final ActivityBenchmarkBinding getBinding() {
        ActivityBenchmarkBinding activityBenchmarkBinding = this._binding;
        if (activityBenchmarkBinding != null) {
            return activityBenchmarkBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        this._binding = ActivityBenchmarkBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getConstraintLayout());
        setContentView(R$layout.activity_benchmark);
    }
}
