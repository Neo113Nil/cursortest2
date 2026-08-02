package com.vk.id.auth;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import android.content.Context;
import com.vk.id.OAuth;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001:\u0003=>?B{\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b5\u0010\u001dR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0013\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b<\u0010,¨\u0006@"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams;", "", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "locale", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "theme", "", "useOAuthProviderIfPossible", "Lcom/vk/id/OAuth;", "oAuth", "Lcom/vk/id/auth/Prompt;", "prompt", "", "state", "codeChallenge", "", "scopes", "", "extraParams", "internalUse", "<init>", "(Lcom/vk/id/auth/VKIDAuthParams$Locale;Lcom/vk/id/auth/VKIDAuthParams$Theme;ZLcom/vk/id/OAuth;Lcom/vk/id/auth/Prompt;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Z)V", "Lkotlin/Function1;", "Lcom/vk/id/auth/VKIDAuthParams$Builder;", "", "initializer", "newBuilder", "(Lkotlin/jvm/functions/Function1;)Lcom/vk/id/auth/VKIDAuthParams;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "getLocale$vkid_release", "()Lcom/vk/id/auth/VKIDAuthParams$Locale;", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "getTheme$vkid_release", "()Lcom/vk/id/auth/VKIDAuthParams$Theme;", "Z", "getUseOAuthProviderIfPossible$vkid_release", "()Z", "Lcom/vk/id/OAuth;", "getOAuth$vkid_release", "()Lcom/vk/id/OAuth;", "Lcom/vk/id/auth/Prompt;", "getPrompt$vkid_release", "()Lcom/vk/id/auth/Prompt;", "Ljava/lang/String;", "getState$vkid_release", "getCodeChallenge$vkid_release", "Ljava/util/Set;", "getScopes$vkid_release", "()Ljava/util/Set;", "Ljava/util/Map;", "getExtraParams$vkid_release", "()Ljava/util/Map;", "getInternalUse$vkid_release", "Locale", "Theme", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDAuthParams {
    private final String codeChallenge;
    private final Map<String, String> extraParams;
    private final boolean internalUse;
    private final Locale locale;
    private final OAuth oAuth;

    @NotNull
    private final Prompt prompt;

    @NotNull
    private final Set<String> scopes;
    private final String state;
    private final Theme theme;
    private final boolean useOAuthProviderIfPossible;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00105\u001a\b\u0012\u0004\u0012\u00020*048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R6\u0010<\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010\u0003\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010C\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010\u0017\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001b¨\u0006G"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Builder;", "", "<init>", "()V", "Lcom/vk/id/auth/VKIDAuthParams;", "build", "()Lcom/vk/id/auth/VKIDAuthParams;", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "locale", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "getLocale", "()Lcom/vk/id/auth/VKIDAuthParams$Locale;", "setLocale", "(Lcom/vk/id/auth/VKIDAuthParams$Locale;)V", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "theme", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "getTheme", "()Lcom/vk/id/auth/VKIDAuthParams$Theme;", "setTheme", "(Lcom/vk/id/auth/VKIDAuthParams$Theme;)V", "", "useOAuthProviderIfPossible", "Z", "getUseOAuthProviderIfPossible", "()Z", "setUseOAuthProviderIfPossible", "(Z)V", "Lcom/vk/id/OAuth;", "oAuth", "Lcom/vk/id/OAuth;", "getOAuth", "()Lcom/vk/id/OAuth;", "setOAuth", "(Lcom/vk/id/OAuth;)V", "Lcom/vk/id/auth/Prompt;", "prompt", "Lcom/vk/id/auth/Prompt;", "getPrompt", "()Lcom/vk/id/auth/Prompt;", "setPrompt", "(Lcom/vk/id/auth/Prompt;)V", "", "state", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "codeChallenge", "getCodeChallenge", "setCodeChallenge", "", "scopes", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "", "extraParams", "Ljava/util/Map;", "getExtraParams", "()Ljava/util/Map;", "setExtraParams", "(Ljava/util/Map;)V", "getExtraParams$annotations", "internalUse", "getInternalUse", "setInternalUse", "getInternalUse$annotations", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private String codeChallenge;
        private Map<String, String> extraParams;
        private boolean internalUse;
        private Locale locale;
        private OAuth oAuth;
        private String state;
        private Theme theme;
        private boolean useOAuthProviderIfPossible = true;

        @NotNull
        private Prompt prompt = Prompt.BLANK;

        @NotNull
        private Set<String> scopes = M.f71699a;

        @NotNull
        public final VKIDAuthParams build() {
            return new VKIDAuthParams(this.locale, this.theme, this.useOAuthProviderIfPossible, this.oAuth, this.prompt, this.state, this.codeChallenge, this.scopes, this.extraParams, this.internalUse, null);
        }

        public final void setCodeChallenge(String str) {
            this.codeChallenge = str;
        }

        public final void setExtraParams(Map<String, String> map) {
            this.extraParams = map;
        }

        public final void setInternalUse(boolean z11) {
            this.internalUse = z11;
        }

        public final void setLocale(Locale locale) {
            this.locale = locale;
        }

        public final void setOAuth(OAuth oAuth) {
            this.oAuth = oAuth;
        }

        public final void setPrompt(@NotNull Prompt prompt) {
            Intrinsics.checkNotNullParameter(prompt, "<set-?>");
            this.prompt = prompt;
        }

        public final void setScopes(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.scopes = set;
        }

        public final void setState(String str) {
            this.state = str;
        }

        public final void setTheme(Theme theme) {
            this.theme = theme;
        }

        public final void setUseOAuthProviderIfPossible(boolean z11) {
            this.useOAuthProviderIfPossible = z11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Locale;", "", "<init>", "(Ljava/lang/String;I)V", "RUS", "UKR", "ENG", "SPA", "GERMAN", "POL", "FRA", "TURKEY", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Locale {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Locale[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Locale RUS = new Locale("RUS", 0);
        public static final Locale UKR = new Locale("UKR", 1);
        public static final Locale ENG = new Locale("ENG", 2);
        public static final Locale SPA = new Locale("SPA", 3);
        public static final Locale GERMAN = new Locale("GERMAN", 4);
        public static final Locale POL = new Locale("POL", 5);
        public static final Locale FRA = new Locale("FRA", 6);
        public static final Locale TURKEY = new Locale("TURKEY", 7);

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Locale$Companion;", "", "<init>", "()V", "systemLocale", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "context", "Landroid/content/Context;", "systemLocale$vkid_release", "fromLocale", "locale", "Ljava/util/Locale;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Locale fromLocale(java.util.Locale locale) {
                String language = locale != null ? locale.getLanguage() : null;
                if (language != null) {
                    int hashCode = language.hashCode();
                    if (hashCode != 3201) {
                        if (hashCode != 3241) {
                            if (hashCode != 3246) {
                                if (hashCode != 3276) {
                                    if (hashCode != 3580) {
                                        if (hashCode != 3651) {
                                            if (hashCode != 3710) {
                                                if (hashCode == 3734 && language.equals("uk")) {
                                                    return Locale.UKR;
                                                }
                                            } else if (language.equals("tr")) {
                                                return Locale.TURKEY;
                                            }
                                        } else if (language.equals("ru")) {
                                            return Locale.RUS;
                                        }
                                    } else if (language.equals("pl")) {
                                        return Locale.POL;
                                    }
                                } else if (language.equals("fr")) {
                                    return Locale.FRA;
                                }
                            } else if (language.equals("es")) {
                                return Locale.SPA;
                            }
                        } else if (language.equals("en")) {
                            return Locale.ENG;
                        }
                    } else if (language.equals("de")) {
                        return Locale.GERMAN;
                    }
                }
                return null;
            }

            public final Locale systemLocale$vkid_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return fromLocale(context.getResources().getConfiguration().getLocales().get(0));
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Locale[] $values() {
            return new Locale[]{RUS, UKR, ENG, SPA, GERMAN, POL, FRA, TURKEY};
        }

        static {
            Locale[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private Locale(String str, int i11) {
        }

        public static Locale valueOf(String str) {
            return (Locale) Enum.valueOf(Locale.class, str);
        }

        public static Locale[] values() {
            return (Locale[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "Light", "Dark", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Theme Light = new Theme("Light", 0);
        public static final Theme Dark = new Theme("Dark", 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Theme$Companion;", "", "<init>", "()V", "systemTheme", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "context", "Landroid/content/Context;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Theme systemTheme(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                int i11 = context.getResources().getConfiguration().uiMode & 48;
                if (i11 == 16) {
                    return Theme.Light;
                }
                if (i11 != 32) {
                    return null;
                }
                return Theme.Dark;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{Light, Dark};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private Theme(String str, int i11) {
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    public /* synthetic */ VKIDAuthParams(Locale locale, Theme theme, boolean z11, OAuth oAuth, Prompt prompt, String str, String str2, Set set, Map map, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, theme, z11, oAuth, prompt, str, str2, set, map, z12);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VKIDAuthParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type com.vk.id.auth.VKIDAuthParams");
        VKIDAuthParams vKIDAuthParams = (VKIDAuthParams) other;
        return this.locale == vKIDAuthParams.locale && this.theme == vKIDAuthParams.theme && this.useOAuthProviderIfPossible == vKIDAuthParams.useOAuthProviderIfPossible && this.oAuth == vKIDAuthParams.oAuth && this.prompt == vKIDAuthParams.prompt && Intrinsics.d(this.state, vKIDAuthParams.state) && Intrinsics.d(this.codeChallenge, vKIDAuthParams.codeChallenge) && Intrinsics.d(this.scopes, vKIDAuthParams.scopes) && Intrinsics.d(this.extraParams, vKIDAuthParams.extraParams) && this.internalUse == vKIDAuthParams.internalUse;
    }

    /* renamed from: getCodeChallenge$vkid_release, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final Map<String, String> getExtraParams$vkid_release() {
        return this.extraParams;
    }

    /* renamed from: getInternalUse$vkid_release, reason: from getter */
    public final boolean getInternalUse() {
        return this.internalUse;
    }

    /* renamed from: getLocale$vkid_release, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: getOAuth$vkid_release, reason: from getter */
    public final OAuth getOAuth() {
        return this.oAuth;
    }

    @NotNull
    /* renamed from: getPrompt$vkid_release, reason: from getter */
    public final Prompt getPrompt() {
        return this.prompt;
    }

    @NotNull
    public final Set<String> getScopes$vkid_release() {
        return this.scopes;
    }

    /* renamed from: getState$vkid_release, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: getTheme$vkid_release, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: getUseOAuthProviderIfPossible$vkid_release, reason: from getter */
    public final boolean getUseOAuthProviderIfPossible() {
        return this.useOAuthProviderIfPossible;
    }

    public int hashCode() {
        Locale locale = this.locale;
        int hashCode = (locale != null ? locale.hashCode() : 0) * 31;
        Theme theme = this.theme;
        int a11 = C3532b.a((hashCode + (theme != null ? theme.hashCode() : 0)) * 31, 31, this.useOAuthProviderIfPossible);
        OAuth oAuth = this.oAuth;
        int hashCode2 = (this.prompt.hashCode() + ((a11 + (oAuth != null ? oAuth.hashCode() : 0)) * 31)) * 31;
        String str = this.state;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.codeChallenge;
        int hashCode4 = (this.scopes.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        Map<String, String> map = this.extraParams;
        return Boolean.hashCode(this.internalUse) + ((hashCode4 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public final VKIDAuthParams newBuilder(@NotNull Function1<? super Builder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Builder builder = new Builder();
        builder.setLocale(this.locale);
        builder.setTheme(this.theme);
        builder.setUseOAuthProviderIfPossible(this.useOAuthProviderIfPossible);
        builder.setOAuth(this.oAuth);
        builder.setPrompt(this.prompt);
        builder.setState(this.state);
        builder.setCodeChallenge(this.codeChallenge);
        builder.setScopes(this.scopes);
        builder.setExtraParams(this.extraParams);
        builder.setInternalUse(this.internalUse);
        initializer.invoke(builder);
        return builder.build();
    }

    @NotNull
    public String toString() {
        return "VKIDAuthParams(locale=" + this.locale + ", theme=" + this.theme + ", useOAuthProviderIfPossible=" + this.useOAuthProviderIfPossible + ", oAuth=" + this.oAuth + ", prompt=" + this.prompt + ", state=" + this.state + ", codeChallenge=" + this.codeChallenge + ", scopes=" + this.scopes + ", extraParams=" + this.extraParams + ", internalUse=" + this.internalUse + ")";
    }

    private VKIDAuthParams(Locale locale, Theme theme, boolean z11, OAuth oAuth, Prompt prompt, String str, String str2, Set<String> set, Map<String, String> map, boolean z12) {
        this.locale = locale;
        this.theme = theme;
        this.useOAuthProviderIfPossible = z11;
        this.oAuth = oAuth;
        this.prompt = prompt;
        this.state = str;
        this.codeChallenge = str2;
        this.scopes = set;
        this.extraParams = map;
        this.internalUse = z12;
    }
}
