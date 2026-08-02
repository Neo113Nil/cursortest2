package com.vk.uxpolls.presentation.js.model;

import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VKWebAppEventData.kt */
/* loaded from: classes6.dex */
public abstract class VKWebAppEventData {

    /* compiled from: VKWebAppEventData.kt */
    public static final class VKWebAppUXPollsConfig extends VKWebAppEventData {
        public final transient String a;

        @pmi0("metadata")
        private final String metadata;

        @pmi0("project")
        private final String project;

        @pmi0("status")
        private final String status;

        @pmi0("theme")
        private final String theme;

        @pmi0("translations")
        private final List<Translation> translations;

        /* compiled from: VKWebAppEventData.kt */
        public static final class Translation {

            @pmi0("key")
            private final String key;

            @pmi0("value")
            private final String value;

            public Translation(String str, String str2) {
                this.key = str;
                this.value = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Translation)) {
                    return false;
                }
                Translation translation = (Translation) obj;
                return epx.f(this.key, translation.key) && epx.f(this.value, translation.value);
            }

            public final int hashCode() {
                return this.value.hashCode() + (this.key.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Translation(key=");
                sb.append(this.key);
                sb.append(", value=");
                return ho8.a(sb, this.value, ')');
            }
        }

        public VKWebAppUXPollsConfig() {
            this(null, null, null, null, null, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VKWebAppUXPollsConfig)) {
                return false;
            }
            VKWebAppUXPollsConfig vKWebAppUXPollsConfig = (VKWebAppUXPollsConfig) obj;
            return epx.f(this.metadata, vKWebAppUXPollsConfig.metadata) && epx.f(this.translations, vKWebAppUXPollsConfig.translations) && epx.f(this.theme, vKWebAppUXPollsConfig.theme) && epx.f(this.project, vKWebAppUXPollsConfig.project) && epx.f(this.status, vKWebAppUXPollsConfig.status);
        }

        public final int hashCode() {
            String str = this.metadata;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Translation> list = this.translations;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.theme;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.project;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.status;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VKWebAppUXPollsConfig(metadata=");
            sb.append(this.metadata);
            sb.append(", translations=");
            sb.append(this.translations);
            sb.append(", theme=");
            sb.append(this.theme);
            sb.append(", project=");
            sb.append(this.project);
            sb.append(", status=");
            return ho8.a(sb, this.status, ')');
        }

        public /* synthetic */ VKWebAppUXPollsConfig(String str, List list, String str2, String str3, String str4, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public VKWebAppUXPollsConfig(String str, List<Translation> list, String str2, String str3, String str4) {
            super(null);
            this.metadata = str;
            this.translations = list;
            this.theme = str2;
            this.project = str3;
            this.status = str4;
            this.a = "VKWebAppUXPollsConfig";
        }
    }

    public /* synthetic */ VKWebAppEventData(zcl zclVar) {
        this();
    }

    private VKWebAppEventData() {
    }
}
