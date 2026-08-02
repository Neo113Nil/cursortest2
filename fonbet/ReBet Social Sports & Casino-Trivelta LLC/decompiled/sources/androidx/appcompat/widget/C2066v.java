package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2066v {

    /* renamed from: a, reason: collision with root package name */
    public TextView f17366a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f17367b;

    /* renamed from: androidx.appcompat.widget.v$a */
    public static final class a {
        @NonNull
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C2066v(TextView textView) {
        this.f17366a = (TextView) x0.f.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f17367b;
        return textClassifier == null ? a.a(this.f17366a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f17367b = textClassifier;
    }
}
