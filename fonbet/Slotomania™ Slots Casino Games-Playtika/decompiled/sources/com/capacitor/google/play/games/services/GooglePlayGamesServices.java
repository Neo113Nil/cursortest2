package com.capacitor.google.play.games.services;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AuthenticationResult;
import com.google.android.gms.games.GamesSignInClient;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.games.PlayGamesSdk;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.games.gamessignin.AuthResponse;
import com.google.android.gms.games.gamessignin.AuthScope;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public class GooglePlayGamesServices {
    private AchievementsClient _achievementsClient;
    private final Activity _activity;
    private final Context _context;
    private GamesSignInClient _gamesSignInClient;
    private boolean _isInitialized = false;
    private PlayersClient _playersClient;

    public GooglePlayGamesServices(Context context, Activity activity) {
        this._activity = activity;
        this._context = context;
    }

    public int isGooglePlayServicesAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this._context);
    }

    public void isAuthenticated(Consumer<AuthenticationResult> consumer, final BiConsumer<String, Exception> biConsumer) {
        Task<AuthenticationResult> isAuthenticated = getGamesSignInClient().isAuthenticated();
        Objects.requireNonNull(consumer);
        isAuthenticated.addOnSuccessListener(new GooglePlayGamesServices$$ExternalSyntheticLambda0(consumer)).addOnFailureListener(new OnFailureListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                biConsumer.accept(exc.toString(), exc);
            }
        });
    }

    public void signIn(Consumer<AuthenticationResult> consumer, final BiConsumer<String, Exception> biConsumer) {
        Task<AuthenticationResult> signIn = getGamesSignInClient().signIn();
        Objects.requireNonNull(consumer);
        signIn.addOnSuccessListener(new GooglePlayGamesServices$$ExternalSyntheticLambda0(consumer)).addOnFailureListener(new OnFailureListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                biConsumer.accept(exc.toString(), exc);
            }
        });
    }

    public void requestServerSideAccess(final Consumer<AuthResponse> consumer, final BiConsumer<String, Exception> biConsumer, String str, boolean z, List<AuthScope> list) {
        Task<AuthResponse> requestServerSideAccess = getGamesSignInClient().requestServerSideAccess(str, z, list);
        Objects.requireNonNull(consumer);
        requestServerSideAccess.addOnSuccessListener(new OnSuccessListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                consumer.accept((AuthResponse) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                biConsumer.accept(exc.toString(), exc);
            }
        });
    }

    public void getCurrentPlayer(final Consumer<Player> consumer, final BiConsumer<String, Exception> biConsumer) {
        Task<Player> currentPlayer = getPlayersClient().getCurrentPlayer();
        Objects.requireNonNull(consumer);
        currentPlayer.addOnSuccessListener(new OnSuccessListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda8
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                consumer.accept((Player) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                biConsumer.accept(exc.toString(), exc);
            }
        });
    }

    public void unlockAchievement(String str, final Consumer<Void> consumer, final BiConsumer<String, Exception> biConsumer) {
        Task<Void> unlockImmediate = getAchievementsClient().unlockImmediate(str);
        Objects.requireNonNull(consumer);
        unlockImmediate.addOnSuccessListener(new OnSuccessListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                consumer.accept((Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                biConsumer.accept(exc.toString(), exc);
            }
        });
    }

    public void setAchievementSteps(String str, int i, final Consumer<Boolean> consumer, final BiConsumer<String, Exception> biConsumer) {
        Task<Boolean> stepsImmediate = getAchievementsClient().setStepsImmediate(str, i);
        Objects.requireNonNull(consumer);
        stepsImmediate.addOnSuccessListener(new OnSuccessListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                consumer.accept((Boolean) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.capacitor.google.play.games.services.GooglePlayGamesServices$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                biConsumer.accept(exc.toString(), exc);
            }
        });
    }

    private void ensureInitialized() {
        if (this._isInitialized) {
            return;
        }
        PlayGamesSdk.initialize(this._context);
        this._isInitialized = true;
    }

    private GamesSignInClient getGamesSignInClient() {
        ensureInitialized();
        if (this._gamesSignInClient == null) {
            this._gamesSignInClient = PlayGames.getGamesSignInClient(this._activity);
        }
        return this._gamesSignInClient;
    }

    private PlayersClient getPlayersClient() {
        ensureInitialized();
        if (this._playersClient == null) {
            this._playersClient = PlayGames.getPlayersClient(this._activity);
        }
        return this._playersClient;
    }

    private AchievementsClient getAchievementsClient() {
        ensureInitialized();
        if (this._achievementsClient == null) {
            this._achievementsClient = PlayGames.getAchievementsClient(this._activity);
        }
        return this._achievementsClient;
    }
}
