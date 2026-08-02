package ru.ozon.id.nativeauth.main;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ErrorView f97286a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f97287b;

    a(ErrorView errorView, String str) {
        this.f97286a = errorView;
        this.f97287b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ErrorView errorView = this.f97286a;
        Object systemService = errorView.getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", this.f97287b));
        }
        Toast.makeText(errorView.getContext(), errorView.getResources().getText(R.string.ozonid_error_incident_copied), 0).show();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ErrorView errorView = this.f97286a;
        ds.setColor(errorView.getResources().getColor(R.color.blue_500, errorView.getContext().getTheme()));
        ds.setUnderlineText(false);
    }
}
