package androidx.car.app.model.signin;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.signin.SignInTemplate;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class QRCodeSignInMethod implements SignInTemplate.b {

    @Nullable
    private final Uri mUri;

    public QRCodeSignInMethod(@NonNull Uri uri) {
        Objects.requireNonNull(uri);
        this.mUri = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QRCodeSignInMethod) {
            return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    @NonNull
    public Uri getUri() {
        Uri uri = this.mUri;
        Objects.requireNonNull(uri);
        return uri;
    }

    public int hashCode() {
        return Objects.hash(this.mUri);
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
