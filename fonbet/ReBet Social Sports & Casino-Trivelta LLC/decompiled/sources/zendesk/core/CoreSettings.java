package zendesk.core;

import java.util.Date;

/* loaded from: classes5.dex */
public class CoreSettings implements Settings {
    private AuthenticationType authentication;

    @Gb.c("brand_id")
    private String brandId;
    private String identifier;

    @Gb.c("updated_at")
    private Date updatedAt;

    public CoreSettings(Date date, AuthenticationType authenticationType) {
        this.updatedAt = date;
        this.authentication = authenticationType;
    }

    public AuthenticationType getAuthentication() {
        return this.authentication;
    }

    public Date getUpdatedAt() {
        return this.updatedAt != null ? new Date(this.updatedAt.getTime()) : new Date(0L);
    }
}
