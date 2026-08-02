package zendesk.core;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes5.dex */
class UserFieldResponse {
    private List<UserField> userFields;

    @NonNull
    public List<UserField> getUserFields() {
        return com.zendesk.util.a.a(this.userFields);
    }
}
