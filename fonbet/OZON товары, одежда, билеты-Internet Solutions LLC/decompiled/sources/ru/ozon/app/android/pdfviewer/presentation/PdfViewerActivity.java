package ru.ozon.app.android.pdfviewer.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.g;
import androidx.fragment.app.Q;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.R$layout;
import ru.ozon.app.android.uikit.R$style;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdfViewerActivity extends g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdfviewer/presentation/PdfViewerActivity$Companion;", "", "<init>", "()V", "EXTRA_URL", "", "EXTRA_IGNORE_AUTHORISE_TOKEN", "startIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ImagesContract.URL, "ignoreAuthoriseToken", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Landroid/content/Intent;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent startIntent(@NotNull Context context, @NotNull String url, Boolean ignoreAuthoriseToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent(context, (Class<?>) PdfViewerActivity.class);
            intent.putExtra("ru.ozon.app.android.pdfviewer.presentation.pdfvieweractivity.url", url);
            intent.putExtra("ru.ozon.app.android.pdfviewer.presentation.pdfvieweractivity.ignoreAuthoriseToken", ignoreAuthoriseToken);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        setContentView(R$layout.pdf_viewer_activity);
        String stringExtra = getIntent().getStringExtra("ru.ozon.app.android.pdfviewer.presentation.pdfvieweractivity.url");
        if (stringExtra == null) {
            throw new IllegalArgumentException("avoid open activity without url");
        }
        if (savedInstanceState == null) {
            Q p11 = getSupportFragmentManager().p();
            p11.r(R$id.rootFl, PdfViewerFragment.INSTANCE.newInstance(stringExtra, getIntent().getBooleanExtra("ru.ozon.app.android.pdfviewer.presentation.pdfvieweractivity.ignoreAuthoriseToken", false)), null);
            p11.i();
        }
    }
}
