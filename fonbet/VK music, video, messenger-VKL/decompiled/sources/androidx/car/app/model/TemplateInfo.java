package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.e8o0;

/* loaded from: classes11.dex */
public final class TemplateInfo {

    @Nullable
    private final Class<? extends e8o0> mTemplateClass;

    @Nullable
    private final String mTemplateId;

    public TemplateInfo(@NonNull Class<? extends e8o0> cls, @NonNull String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    @NonNull
    public Class<? extends e8o0> getTemplateClass() {
        Class<? extends e8o0> cls = this.mTemplateClass;
        Objects.requireNonNull(cls);
        return cls;
    }

    @NonNull
    public String getTemplateId() {
        String str = this.mTemplateId;
        Objects.requireNonNull(str);
        return str;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }
}
