package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import xsna.e8o0;

/* loaded from: classes11.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";

    @Nullable
    private final e8o0 mTemplate;

    public static final class a {
    }

    public TabContents(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    @NonNull
    public String getContentId() {
        return CONTENT_ID;
    }

    @NonNull
    public e8o0 getTemplate() {
        e8o0 e8o0Var = this.mTemplate;
        Objects.requireNonNull(e8o0Var);
        return e8o0Var;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    @NonNull
    public String toString() {
        return "[template: " + this.mTemplate + X3.j.e;
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
