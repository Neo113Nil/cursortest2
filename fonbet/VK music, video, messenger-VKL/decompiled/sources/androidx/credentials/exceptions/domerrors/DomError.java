package androidx.credentials.exceptions.domerrors;

/* compiled from: DomError.kt */
/* loaded from: classes12.dex */
public abstract class DomError {
    private final String type;

    public DomError(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
