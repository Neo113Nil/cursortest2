package io.intercom.android.sdk.models;

/* loaded from: classes9.dex */
final class AutoValue_SocialAccount extends SocialAccount {
    private final String profileUrl;
    private final String provider;

    AutoValue_SocialAccount(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null provider");
        }
        this.provider = str;
        if (str2 == null) {
            throw new NullPointerException("Null profileUrl");
        }
        this.profileUrl = str2;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProvider() {
        return this.provider;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProfileUrl() {
        return this.profileUrl;
    }

    public String toString() {
        return "SocialAccount{provider=" + this.provider + ", profileUrl=" + this.profileUrl + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialAccount) {
            SocialAccount socialAccount = (SocialAccount) obj;
            if (this.provider.equals(socialAccount.getProvider()) && this.profileUrl.equals(socialAccount.getProfileUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.provider.hashCode() ^ 1000003) * 1000003) ^ this.profileUrl.hashCode();
    }
}
