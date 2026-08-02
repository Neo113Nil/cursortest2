package zendesk.core;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class User {

    /* renamed from: id, reason: collision with root package name */
    private final Long f68703id = -1L;
    private final String name = "";
    private final Attachment photo = null;
    private final boolean agent = false;
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public Long getId() {
        return this.f68703id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoto() {
        Attachment attachment = this.photo;
        if (attachment == null) {
            return null;
        }
        return attachment.getContentUrl();
    }

    @NonNull
    public List<String> getTags() {
        return com.zendesk.util.a.a(this.tags);
    }

    @NonNull
    public Map<String, String> getUserFields() {
        return com.zendesk.util.a.b(this.userFields);
    }

    public boolean isAgent() {
        return this.agent;
    }
}
