package com.capacitor.google.play.games.services;

import android.util.Log;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.google.android.gms.games.AuthenticationResult;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.gamessignin.AuthResponse;
import com.google.android.gms.games.gamessignin.AuthScope;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

@NativePlugin
/* loaded from: classes.dex */
public class GooglePlayGamesServicesPlugin extends Plugin {
    private static final String TAG = "GooglePlayGamesServicesPlugin";
    private GooglePlayGamesServices googlePlayGamesServices;

    @Override // com.getcapacitor.Plugin
    public void load() {
        this.googlePlayGamesServices = new GooglePlayGamesServices(getContext(), getBridge().getActivity());
    }

    @PluginMethod
    public void isGooglePlayServicesAvailable(PluginCall pluginCall) {
        int isGooglePlayServicesAvailable = this.googlePlayGamesServices.isGooglePlayServicesAvailable();
        JSObject jSObject = new JSObject();
        jSObject.put(X3.f.f, isGooglePlayServicesAvailable);
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void isAuthenticated(final PluginCall pluginCall) {
        GooglePlayGamesServices googlePlayGamesServices = this.googlePlayGamesServices;
        Consumer<AuthenticationResult> consumer = new Consumer() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GooglePlayGamesServicesPlugin.lambda$isAuthenticated$0(PluginCall.this, (AuthenticationResult) obj);
            }
        };
        Objects.requireNonNull(pluginCall);
        googlePlayGamesServices.isAuthenticated(consumer, new GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda1(pluginCall));
    }

    static /* synthetic */ void lambda$isAuthenticated$0(PluginCall pluginCall, AuthenticationResult authenticationResult) {
        JSObject jSObject = new JSObject();
        jSObject.put("isAuthenticated", authenticationResult.isAuthenticated());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void signIn(final PluginCall pluginCall) {
        GooglePlayGamesServices googlePlayGamesServices = this.googlePlayGamesServices;
        Consumer<AuthenticationResult> consumer = new Consumer() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GooglePlayGamesServicesPlugin.lambda$signIn$1(PluginCall.this, (AuthenticationResult) obj);
            }
        };
        Objects.requireNonNull(pluginCall);
        googlePlayGamesServices.signIn(consumer, new GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda1(pluginCall));
    }

    static /* synthetic */ void lambda$signIn$1(PluginCall pluginCall, AuthenticationResult authenticationResult) {
        JSObject jSObject = new JSObject();
        jSObject.put("isAuthenticated", authenticationResult.isAuthenticated());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void requestServerSideAccess(final PluginCall pluginCall) {
        String authWebClientId = getAuthWebClientId();
        if (authWebClientId == null) {
            pluginCall.reject("oauthWebClientId not configured. Add it to capacitor.config.json");
            return;
        }
        boolean booleanValue = pluginCall.getBoolean("forceRefreshToken", false).booleanValue();
        List<AuthScope> parseScopes = parseScopes(pluginCall);
        GooglePlayGamesServices googlePlayGamesServices = this.googlePlayGamesServices;
        Consumer<AuthResponse> consumer = new Consumer() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GooglePlayGamesServicesPlugin.lambda$requestServerSideAccess$2(PluginCall.this, (AuthResponse) obj);
            }
        };
        Objects.requireNonNull(pluginCall);
        googlePlayGamesServices.requestServerSideAccess(consumer, new GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda1(pluginCall), authWebClientId, booleanValue, parseScopes);
    }

    static /* synthetic */ void lambda$requestServerSideAccess$2(PluginCall pluginCall, AuthResponse authResponse) {
        JSObject jSObject = new JSObject();
        jSObject.put("authCode", authResponse.getAuthCode());
        jSObject.put("grantedScopes", (Object) new JSArray((Collection) authResponse.getGrantedScopes().stream().map(new Function() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String name;
                name = ((AuthScope) obj).name();
                return name;
            }
        }).collect(Collectors.toList())));
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void getCurrentPlayer(final PluginCall pluginCall) {
        GooglePlayGamesServices googlePlayGamesServices = this.googlePlayGamesServices;
        Consumer<Player> consumer = new Consumer() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                GooglePlayGamesServicesPlugin.lambda$getCurrentPlayer$3(PluginCall.this, (Player) obj);
            }
        };
        Objects.requireNonNull(pluginCall);
        googlePlayGamesServices.getCurrentPlayer(consumer, new GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda1(pluginCall));
    }

    static /* synthetic */ void lambda$getCurrentPlayer$3(PluginCall pluginCall, Player player) {
        JSObject jSObject = new JSObject();
        jSObject.put("playerId", player.getPlayerId());
        jSObject.put("displayName", player.getDisplayName());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void reportAchievement(final PluginCall pluginCall) {
        String string = pluginCall.getString("id");
        Integer num = pluginCall.getInt("currentProgress");
        Integer num2 = pluginCall.getInt("targetProgress");
        if (string == null) {
            pluginCall.reject("Achievement id is required");
            return;
        }
        if (num2 != null) {
            if (num2.intValue() >= 1) {
                boolean z = num2.intValue() > 1;
                if (z && (num == null || num.intValue() < 0)) {
                    pluginCall.reject("Integer currentProgress value required: currentProgress >= 0");
                    return;
                }
                if (z) {
                    GooglePlayGamesServices googlePlayGamesServices = this.googlePlayGamesServices;
                    int intValue = num.intValue();
                    Consumer<Boolean> consumer = new Consumer() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            GooglePlayGamesServicesPlugin.lambda$reportAchievement$4(PluginCall.this, (Boolean) obj);
                        }
                    };
                    Objects.requireNonNull(pluginCall);
                    googlePlayGamesServices.setAchievementSteps(string, intValue, consumer, new GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda1(pluginCall));
                    return;
                }
                GooglePlayGamesServices googlePlayGamesServices2 = this.googlePlayGamesServices;
                Consumer<Void> consumer2 = new Consumer() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        GooglePlayGamesServicesPlugin.lambda$reportAchievement$5(PluginCall.this, (Void) obj);
                    }
                };
                Objects.requireNonNull(pluginCall);
                googlePlayGamesServices2.unlockAchievement(string, consumer2, new GooglePlayGamesServicesPlugin$$ExternalSyntheticLambda1(pluginCall));
                return;
            }
        }
        pluginCall.reject("Integer targetProgress value required: targetProgress >= 1");
    }

    static /* synthetic */ void lambda$reportAchievement$4(PluginCall pluginCall, Boolean bool) {
        JSObject jSObject = new JSObject();
        jSObject.put("isUnlocked", (Object) bool);
        pluginCall.resolve(jSObject);
    }

    static /* synthetic */ void lambda$reportAchievement$5(PluginCall pluginCall, Void r3) {
        JSObject jSObject = new JSObject();
        jSObject.put("isUnlocked", true);
        pluginCall.resolve(jSObject);
    }

    private String getAuthWebClientId() {
        Object configValue = getConfigValue("oauthWebClientId");
        if (configValue == null) {
            return null;
        }
        return configValue.toString();
    }

    private List<AuthScope> parseScopes(PluginCall pluginCall) {
        JSArray array = pluginCall.getArray("scopes");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < array.length(); i++) {
            try {
                arrayList.add(AuthScope.valueOf(array.getString(i)));
            } catch (Exception e) {
                Log.e(TAG, "Bad requestServerSideAccess scope:", e);
            }
        }
        return arrayList;
    }
}
