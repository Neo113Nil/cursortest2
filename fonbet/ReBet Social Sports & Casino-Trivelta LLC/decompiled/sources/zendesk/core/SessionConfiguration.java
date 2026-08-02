package zendesk.core;

import java.util.Locale;

/* loaded from: classes5.dex */
class SessionConfiguration {
    private Identity identity;
    private Locale locale;

    public static class Builder {
        private Identity identity;
        private Locale locale;

        public SessionConfiguration build() {
            return new SessionConfiguration(this);
        }

        public Builder setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        private Builder(SessionConfiguration sessionConfiguration) {
            this.identity = new Identity() { // from class: zendesk.core.SessionConfiguration.Builder.1
            };
            this.locale = Locale.getDefault();
            this.identity = sessionConfiguration.getIdentity();
        }

        public Builder() {
            this.identity = new Identity() { // from class: zendesk.core.SessionConfiguration.Builder.1
            };
            this.locale = Locale.getDefault();
        }
    }

    public Identity getIdentity() {
        return this.identity;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    private SessionConfiguration(Builder builder) {
        this.identity = builder.identity;
        this.locale = builder.locale;
    }
}
