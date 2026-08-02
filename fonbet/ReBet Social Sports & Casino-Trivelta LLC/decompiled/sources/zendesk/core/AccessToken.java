package zendesk.core;

/* loaded from: classes5.dex */
class AccessToken {
    private String accessToken;

    @Gb.c("user_id")
    private String userId;

    public AccessToken() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AccessToken accessToken = (AccessToken) obj;
            String str = this.accessToken;
            if (str == null ? accessToken.accessToken != null : !str.equals(accessToken.accessToken)) {
                return false;
            }
            String str2 = this.userId;
            String str3 = accessToken.userId;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.accessToken;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public AccessToken(String str, String str2) {
        this.accessToken = str;
        this.userId = str2;
    }
}
