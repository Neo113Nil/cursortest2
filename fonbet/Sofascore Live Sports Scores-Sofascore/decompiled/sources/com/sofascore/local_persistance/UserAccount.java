package com.sofascore.local_persistance;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fc6;
import defpackage.gc2;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.wv8;
import defpackage.wx4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b5\u0018\u0000 c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001cBé\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0017¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0003H\u0016¢\u0006\u0004\b5\u00106Jï\u0002\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u00106R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b;\u00106R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b<\u00106R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b=\u00106R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b>\u00106R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b\n\u0010@R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010@R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bB\u00106R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bC\u00106R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bD\u0010@R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bE\u0010@R\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bF\u0010@R\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bG\u0010@R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\bK\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\bL\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\bM\u00106R\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b\u0017\u0010@R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bO\u00104R\u001a\u0010\u001a\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010N\u001a\u0004\bP\u00104R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bQ\u00104R\u001a\u0010\u001c\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010H\u001a\u0004\bR\u0010JR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00109\u001a\u0004\bS\u00106R\u001a\u0010\u001e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b\u001e\u0010@R\u001a\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010T\u001a\u0004\bU\u0010VR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010?\u001a\u0004\bW\u0010@R\u001a\u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\bX\u0010@R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\bY\u00106R\u001a\u0010$\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010H\u001a\u0004\bZ\u0010JR\u001a\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00109\u001a\u0004\b[\u00106R\u001c\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\\\u001a\u0004\b_\u0010^R\u001c\u0010(\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010`\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lcom/sofascore/local_persistance/UserAccount;", "Lcom/squareup/wire/Message;", "", "", "id", "userName", "type", "token", "tokenSecret", "", "isLoggedIn", "hasServerAds", "imageUrl", "nickname", "purchasedAds", "devMod", "forceAds", "showTestRating", "", "joinDate", "chatRole", "chatFlag", "editorName", "isEditor", "", "previousLeaderboardId", "leaderboardId", "maxLeaderboardLevel", "syncTimestamp", "chatUsernameColor", "isActiveCrowdsourcer", "", "credibilityScore", "fantasyUser", "forceHideAds", "userBadge", "weeklyChallengeDailyBonusUsedAtTimestamp", "providerType", "hasPremium", "dataSharingOptOut", "premiumTokenExpirationTimestamp", "Lgc2;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIJLjava/lang/String;ZFZZLjava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lgc2;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIJLjava/lang/String;ZFZZLjava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lgc2;)Lcom/sofascore/local_persistance/UserAccount;", "Ljava/lang/String;", "getId", "getUserName", "getType", "getToken", "getTokenSecret", "Z", "()Z", "getHasServerAds", "getImageUrl", "getNickname", "getPurchasedAds", "getDevMod", "getForceAds", "getShowTestRating", "J", "getJoinDate", "()J", "getChatRole", "getChatFlag", "getEditorName", "I", "getPreviousLeaderboardId", "getLeaderboardId", "getMaxLeaderboardLevel", "getSyncTimestamp", "getChatUsernameColor", "F", "getCredibilityScore", "()F", "getFantasyUser", "getForceHideAds", "getUserBadge", "getWeeklyChallengeDailyBonusUsedAtTimestamp", "getProviderType", "Ljava/lang/Boolean;", "getHasPremium", "()Ljava/lang/Boolean;", "getDataSharingOptOut", "Ljava/lang/Long;", "getPremiumTokenExpirationTimestamp", "()Ljava/lang/Long;", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAccount extends Message {

    @NotNull
    public static final ProtoAdapter<UserAccount> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 16)
    @Nullable
    private final String chatFlag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    @NotNull
    private final String chatRole;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 22, tag = 24)
    @Nullable
    private final String chatUsernameColor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 26)
    private final float credibilityScore;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 31, tag = 36)
    @Nullable
    private final Boolean dataSharingOptOut;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean devMod;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 16, tag = 18)
    @Nullable
    private final String editorName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 27)
    private final boolean fantasyUser;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final boolean forceAds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 28)
    private final boolean forceHideAds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 30, tag = 35)
    @Nullable
    private final Boolean hasPremium;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean hasServerAds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    @NotNull
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    @NotNull
    private final String imageUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 25)
    private final boolean isActiveCrowdsourcer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final boolean isEditor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean isLoggedIn;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final long joinDate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final int leaderboardId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final int maxLeaderboardLevel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    @NotNull
    private final String nickname;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 32, tag = 37)
    @Nullable
    private final Long premiumTokenExpirationTimestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final int previousLeaderboardId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 34)
    @NotNull
    private final String providerType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean purchasedAds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final boolean showTestRating;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 23)
    private final long syncTimestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    @NotNull
    private final String token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    @NotNull
    private final String tokenSecret;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    @NotNull
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 27, tag = 29)
    @Nullable
    private final String userBadge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    @NotNull
    private final String userName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 30)
    private final long weeklyChallengeDailyBonusUsedAtTimestamp;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(UserAccount.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.sofascore.local_persistance.UserAccount$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0050. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public UserAccount decode(ProtoReader reader) {
                String decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = str;
                String str3 = str2;
                String str4 = str3;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                Boolean bool = null;
                Boolean bool2 = null;
                Long l = null;
                float f = 0.0f;
                String str9 = str4;
                String str10 = str9;
                String str11 = str10;
                String str12 = str11;
                String str13 = str12;
                while (true) {
                    int nextTag = reader.nextTag();
                    String str14 = str9;
                    if (nextTag == -1) {
                        return new UserAccount(str, str14, str10, str11, str12, z, z2, str13, str2, z3, z4, z5, z6, j, str3, str5, str6, z7, i, i2, i3, j2, str7, z8, f, z9, z10, str8, j3, str4, bool, bool2, l, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            break;
                        case 2:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 3:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 4:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 5:
                            str12 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 6:
                            z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 7:
                            z2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 8:
                            str13 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 9:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 10:
                            z3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 11:
                            z4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 12:
                            z5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 13:
                            z6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 14:
                            j = ProtoAdapter.UINT64.decode(reader).longValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 15:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 16:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 17:
                        case 31:
                        case 32:
                        case 33:
                        default:
                            reader.readUnknownField(nextTag);
                            decode = str;
                            str9 = str14;
                            break;
                        case 18:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 19:
                            z7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 20:
                            i = ProtoAdapter.INT32.decode(reader).intValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 21:
                            i2 = ProtoAdapter.INT32.decode(reader).intValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 22:
                            i3 = ProtoAdapter.INT32.decode(reader).intValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 23:
                            j2 = ProtoAdapter.UINT64.decode(reader).longValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 24:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 25:
                            z8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 26:
                            f = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 27:
                            z9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 28:
                            z10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 29:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 30:
                            j3 = ProtoAdapter.UINT64.decode(reader).longValue();
                            str9 = str14;
                            decode = str;
                            break;
                        case 34:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 35:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 36:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                        case 37:
                            l = ProtoAdapter.UINT64.decode(reader);
                            str9 = str14;
                            decode = str;
                            break;
                    }
                    str = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserAccount value) {
                writer.getClass();
                value.getClass();
                if (!Intrinsics.c(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.c(value.getUserName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUserName());
                }
                if (!Intrinsics.c(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.c(value.getToken(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getToken());
                }
                if (!Intrinsics.c(value.getTokenSecret(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTokenSecret());
                }
                if (value.getIsLoggedIn()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIsLoggedIn()));
                }
                if (value.getHasServerAds()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getHasServerAds()));
                }
                if (!Intrinsics.c(value.getImageUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getImageUrl());
                }
                if (!Intrinsics.c(value.getNickname(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getNickname());
                }
                if (value.getPurchasedAds()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getPurchasedAds()));
                }
                if (value.getDevMod()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getDevMod()));
                }
                if (value.getForceAds()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getForceAds()));
                }
                if (value.getShowTestRating()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getShowTestRating()));
                }
                if (value.getJoinDate() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getJoinDate()));
                }
                if (!Intrinsics.c(value.getChatRole(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getChatRole());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 16, (int) value.getChatFlag());
                protoAdapter.encodeWithTag(writer, 18, (int) value.getEditorName());
                if (value.getIsEditor()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getIsEditor()));
                }
                if (value.getPreviousLeaderboardId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 20, (int) Integer.valueOf(value.getPreviousLeaderboardId()));
                }
                if (value.getLeaderboardId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getLeaderboardId()));
                }
                if (value.getMaxLeaderboardLevel() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 22, (int) Integer.valueOf(value.getMaxLeaderboardLevel()));
                }
                if (value.getSyncTimestamp() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 23, (int) Long.valueOf(value.getSyncTimestamp()));
                }
                protoAdapter.encodeWithTag(writer, 24, (int) value.getChatUsernameColor());
                if (value.getIsActiveCrowdsourcer()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getIsActiveCrowdsourcer()));
                }
                if (!Float.valueOf(value.getCredibilityScore()).equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 26, (int) Float.valueOf(value.getCredibilityScore()));
                }
                if (value.getFantasyUser()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 27, (int) Boolean.valueOf(value.getFantasyUser()));
                }
                if (value.getForceHideAds()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 28, (int) Boolean.valueOf(value.getForceHideAds()));
                }
                protoAdapter.encodeWithTag(writer, 29, (int) value.getUserBadge());
                if (value.getWeeklyChallengeDailyBonusUsedAtTimestamp() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 30, (int) Long.valueOf(value.getWeeklyChallengeDailyBonusUsedAtTimestamp()));
                }
                if (!Intrinsics.c(value.getProviderType(), "")) {
                    protoAdapter.encodeWithTag(writer, 34, (int) value.getProviderType());
                }
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 35, (int) value.getHasPremium());
                protoAdapter2.encodeWithTag(writer, 36, (int) value.getDataSharingOptOut());
                ProtoAdapter.UINT64.encodeWithTag(writer, 37, (int) value.getPremiumTokenExpirationTimestamp());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserAccount value) {
                value.getClass();
                int h = value.unknownFields().h();
                if (!Intrinsics.c(value.getId(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.c(value.getUserName(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUserName());
                }
                if (!Intrinsics.c(value.getType(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getType());
                }
                if (!Intrinsics.c(value.getToken(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getToken());
                }
                if (!Intrinsics.c(value.getTokenSecret(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTokenSecret());
                }
                if (value.getIsLoggedIn()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIsLoggedIn()));
                }
                if (value.getHasServerAds()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getHasServerAds()));
                }
                if (!Intrinsics.c(value.getImageUrl(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getImageUrl());
                }
                if (!Intrinsics.c(value.getNickname(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getNickname());
                }
                if (value.getPurchasedAds()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getPurchasedAds()));
                }
                if (value.getDevMod()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(11, Boolean.valueOf(value.getDevMod()));
                }
                if (value.getForceAds()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getForceAds()));
                }
                if (value.getShowTestRating()) {
                    h += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getShowTestRating()));
                }
                if (value.getJoinDate() != 0) {
                    h += ProtoAdapter.UINT64.encodedSizeWithTag(14, Long.valueOf(value.getJoinDate()));
                }
                if (!Intrinsics.c(value.getChatRole(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getChatRole());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(18, value.getEditorName()) + protoAdapter.encodedSizeWithTag(16, value.getChatFlag()) + h;
                if (value.getIsEditor()) {
                    encodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(19, Boolean.valueOf(value.getIsEditor()));
                }
                if (value.getPreviousLeaderboardId() != 0) {
                    encodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(20, Integer.valueOf(value.getPreviousLeaderboardId()));
                }
                if (value.getLeaderboardId() != 0) {
                    encodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.getLeaderboardId()));
                }
                if (value.getMaxLeaderboardLevel() != 0) {
                    encodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(22, Integer.valueOf(value.getMaxLeaderboardLevel()));
                }
                if (value.getSyncTimestamp() != 0) {
                    encodedSizeWithTag += ProtoAdapter.UINT64.encodedSizeWithTag(23, Long.valueOf(value.getSyncTimestamp()));
                }
                int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(24, value.getChatUsernameColor()) + encodedSizeWithTag;
                if (value.getIsActiveCrowdsourcer()) {
                    encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.getIsActiveCrowdsourcer()));
                }
                if (!Float.valueOf(value.getCredibilityScore()).equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    encodedSizeWithTag2 += ProtoAdapter.FLOAT.encodedSizeWithTag(26, Float.valueOf(value.getCredibilityScore()));
                }
                if (value.getFantasyUser()) {
                    encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(27, Boolean.valueOf(value.getFantasyUser()));
                }
                if (value.getForceHideAds()) {
                    encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(28, Boolean.valueOf(value.getForceHideAds()));
                }
                int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(29, value.getUserBadge()) + encodedSizeWithTag2;
                if (value.getWeeklyChallengeDailyBonusUsedAtTimestamp() != 0) {
                    encodedSizeWithTag3 += ProtoAdapter.UINT64.encodedSizeWithTag(30, Long.valueOf(value.getWeeklyChallengeDailyBonusUsedAtTimestamp()));
                }
                if (!Intrinsics.c(value.getProviderType(), "")) {
                    encodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(34, value.getProviderType());
                }
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                return ProtoAdapter.UINT64.encodedSizeWithTag(37, value.getPremiumTokenExpirationTimestamp()) + protoAdapter2.encodedSizeWithTag(36, value.getDataSharingOptOut()) + protoAdapter2.encodedSizeWithTag(35, value.getHasPremium()) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserAccount redact(UserAccount value) {
                value.getClass();
                return UserAccount.copy$default(value, null, null, null, null, null, false, false, null, null, false, false, false, false, 0L, null, null, null, false, 0, 0, 0, 0L, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, 0L, null, null, null, null, gc2.d, -1, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserAccount value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
                protoAdapter.encodeWithTag(writer, 37, (int) value.getPremiumTokenExpirationTimestamp());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 36, (int) value.getDataSharingOptOut());
                protoAdapter2.encodeWithTag(writer, 35, (int) value.getHasPremium());
                if (!Intrinsics.c(value.getProviderType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 34, (int) value.getProviderType());
                }
                if (value.getWeeklyChallengeDailyBonusUsedAtTimestamp() != 0) {
                    protoAdapter.encodeWithTag(writer, 30, (int) Long.valueOf(value.getWeeklyChallengeDailyBonusUsedAtTimestamp()));
                }
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 29, (int) value.getUserBadge());
                if (value.getForceHideAds()) {
                    protoAdapter2.encodeWithTag(writer, 28, (int) Boolean.valueOf(value.getForceHideAds()));
                }
                if (value.getFantasyUser()) {
                    protoAdapter2.encodeWithTag(writer, 27, (int) Boolean.valueOf(value.getFantasyUser()));
                }
                if (!Float.valueOf(value.getCredibilityScore()).equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 26, (int) Float.valueOf(value.getCredibilityScore()));
                }
                if (value.getIsActiveCrowdsourcer()) {
                    protoAdapter2.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getIsActiveCrowdsourcer()));
                }
                protoAdapter3.encodeWithTag(writer, 24, (int) value.getChatUsernameColor());
                if (value.getSyncTimestamp() != 0) {
                    protoAdapter.encodeWithTag(writer, 23, (int) Long.valueOf(value.getSyncTimestamp()));
                }
                if (value.getMaxLeaderboardLevel() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 22, (int) Integer.valueOf(value.getMaxLeaderboardLevel()));
                }
                if (value.getLeaderboardId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getLeaderboardId()));
                }
                if (value.getPreviousLeaderboardId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 20, (int) Integer.valueOf(value.getPreviousLeaderboardId()));
                }
                if (value.getIsEditor()) {
                    protoAdapter2.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getIsEditor()));
                }
                protoAdapter3.encodeWithTag(writer, 18, (int) value.getEditorName());
                protoAdapter3.encodeWithTag(writer, 16, (int) value.getChatFlag());
                if (!Intrinsics.c(value.getChatRole(), "")) {
                    protoAdapter3.encodeWithTag(writer, 15, (int) value.getChatRole());
                }
                if (value.getJoinDate() != 0) {
                    protoAdapter.encodeWithTag(writer, 14, (int) Long.valueOf(value.getJoinDate()));
                }
                if (value.getShowTestRating()) {
                    protoAdapter2.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getShowTestRating()));
                }
                if (value.getForceAds()) {
                    protoAdapter2.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getForceAds()));
                }
                if (value.getDevMod()) {
                    protoAdapter2.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getDevMod()));
                }
                if (value.getPurchasedAds()) {
                    protoAdapter2.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getPurchasedAds()));
                }
                if (!Intrinsics.c(value.getNickname(), "")) {
                    protoAdapter3.encodeWithTag(writer, 9, (int) value.getNickname());
                }
                if (!Intrinsics.c(value.getImageUrl(), "")) {
                    protoAdapter3.encodeWithTag(writer, 8, (int) value.getImageUrl());
                }
                if (value.getHasServerAds()) {
                    protoAdapter2.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getHasServerAds()));
                }
                if (value.getIsLoggedIn()) {
                    protoAdapter2.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIsLoggedIn()));
                }
                if (!Intrinsics.c(value.getTokenSecret(), "")) {
                    protoAdapter3.encodeWithTag(writer, 5, (int) value.getTokenSecret());
                }
                if (!Intrinsics.c(value.getToken(), "")) {
                    protoAdapter3.encodeWithTag(writer, 4, (int) value.getToken());
                }
                if (!Intrinsics.c(value.getType(), "")) {
                    protoAdapter3.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.c(value.getUserName(), "")) {
                    protoAdapter3.encodeWithTag(writer, 2, (int) value.getUserName());
                }
                if (Intrinsics.c(value.getId(), "")) {
                    return;
                }
                protoAdapter3.encodeWithTag(writer, 1, (int) value.getId());
            }
        };
    }

    public /* synthetic */ UserAccount(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, boolean z3, boolean z4, boolean z5, boolean z6, long j, String str8, String str9, String str10, boolean z7, int i, int i2, int i3, long j2, String str11, boolean z8, float f, boolean z9, boolean z10, String str12, long j3, String str13, Boolean bool, Boolean bool2, Long l, gc2 gc2Var, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? "" : str6, (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? "" : str7, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? false : z4, (i4 & a.o) != 0 ? false : z5, (i4 & 4096) != 0 ? false : z6, (i4 & 8192) != 0 ? 0L : j, (i4 & 16384) != 0 ? "" : str8, (i4 & 32768) != 0 ? null : str9, (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str10, (i4 & 131072) != 0 ? false : z7, (i4 & 262144) != 0 ? 0 : i, (i4 & 524288) != 0 ? 0 : i2, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0 : i3, (i4 & 2097152) != 0 ? 0L : j2, (i4 & 4194304) != 0 ? null : str11, (i4 & 8388608) != 0 ? false : z8, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f, (i4 & 33554432) != 0 ? false : z9, (i4 & 67108864) != 0 ? false : z10, (i4 & 134217728) != 0 ? null : str12, (i4 & 268435456) == 0 ? j3 : 0L, (i4 & 536870912) == 0 ? str13 : "", (i4 & 1073741824) != 0 ? null : bool, (i4 & Integer.MIN_VALUE) != 0 ? null : bool2, (i5 & 1) == 0 ? l : null, (i5 & 2) != 0 ? gc2.d : gc2Var);
    }

    public static /* synthetic */ UserAccount copy$default(UserAccount userAccount, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, boolean z3, boolean z4, boolean z5, boolean z6, long j, String str8, String str9, String str10, boolean z7, int i, int i2, int i3, long j2, String str11, boolean z8, float f, boolean z9, boolean z10, String str12, long j3, String str13, Boolean bool, Boolean bool2, Long l, gc2 gc2Var, int i4, int i5, Object obj) {
        String str14 = (i4 & 1) != 0 ? userAccount.id : str;
        String str15 = (i4 & 2) != 0 ? userAccount.userName : str2;
        String str16 = (i4 & 4) != 0 ? userAccount.type : str3;
        String str17 = (i4 & 8) != 0 ? userAccount.token : str4;
        String str18 = (i4 & 16) != 0 ? userAccount.tokenSecret : str5;
        boolean z11 = (i4 & 32) != 0 ? userAccount.isLoggedIn : z;
        boolean z12 = (i4 & 64) != 0 ? userAccount.hasServerAds : z2;
        String str19 = (i4 & 128) != 0 ? userAccount.imageUrl : str6;
        String str20 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? userAccount.nickname : str7;
        boolean z13 = (i4 & 512) != 0 ? userAccount.purchasedAds : z3;
        boolean z14 = (i4 & 1024) != 0 ? userAccount.devMod : z4;
        boolean z15 = (i4 & a.o) != 0 ? userAccount.forceAds : z5;
        boolean z16 = (i4 & 4096) != 0 ? userAccount.showTestRating : z6;
        String str21 = str14;
        String str22 = str15;
        long j4 = (i4 & 8192) != 0 ? userAccount.joinDate : j;
        String str23 = (i4 & 16384) != 0 ? userAccount.chatRole : str8;
        String str24 = (i4 & 32768) != 0 ? userAccount.chatFlag : str9;
        String str25 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? userAccount.editorName : str10;
        boolean z17 = (i4 & 131072) != 0 ? userAccount.isEditor : z7;
        int i6 = (i4 & 262144) != 0 ? userAccount.previousLeaderboardId : i;
        int i7 = (i4 & 524288) != 0 ? userAccount.leaderboardId : i2;
        int i8 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? userAccount.maxLeaderboardLevel : i3;
        long j5 = j4;
        long j6 = (i4 & 2097152) != 0 ? userAccount.syncTimestamp : j2;
        String str26 = (i4 & 4194304) != 0 ? userAccount.chatUsernameColor : str11;
        long j7 = j6;
        boolean z18 = (i4 & 8388608) != 0 ? userAccount.isActiveCrowdsourcer : z8;
        float f2 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? userAccount.credibilityScore : f;
        return userAccount.copy(str21, str22, str16, str17, str18, z11, z12, str19, str20, z13, z14, z15, z16, j5, str23, str24, str25, z17, i6, i7, i8, j7, str26, z18, f2, (i4 & 33554432) != 0 ? userAccount.fantasyUser : z9, (i4 & 67108864) != 0 ? userAccount.forceHideAds : z10, (i4 & 134217728) != 0 ? userAccount.userBadge : str12, (i4 & 268435456) != 0 ? userAccount.weeklyChallengeDailyBonusUsedAtTimestamp : j3, (i4 & 536870912) != 0 ? userAccount.providerType : str13, (i4 & 1073741824) != 0 ? userAccount.hasPremium : bool, (i4 & Integer.MIN_VALUE) != 0 ? userAccount.dataSharingOptOut : bool2, (i5 & 1) != 0 ? userAccount.premiumTokenExpirationTimestamp : l, (i5 & 2) != 0 ? userAccount.unknownFields() : gc2Var);
    }

    @NotNull
    public final UserAccount copy(@NotNull String id, @NotNull String userName, @NotNull String type, @NotNull String token, @NotNull String tokenSecret, boolean isLoggedIn, boolean hasServerAds, @NotNull String imageUrl, @NotNull String nickname, boolean purchasedAds, boolean devMod, boolean forceAds, boolean showTestRating, long joinDate, @NotNull String chatRole, @Nullable String chatFlag, @Nullable String editorName, boolean isEditor, int previousLeaderboardId, int leaderboardId, int maxLeaderboardLevel, long syncTimestamp, @Nullable String chatUsernameColor, boolean isActiveCrowdsourcer, float credibilityScore, boolean fantasyUser, boolean forceHideAds, @Nullable String userBadge, long weeklyChallengeDailyBonusUsedAtTimestamp, @NotNull String providerType, @Nullable Boolean hasPremium, @Nullable Boolean dataSharingOptOut, @Nullable Long premiumTokenExpirationTimestamp, @NotNull gc2 unknownFields) {
        id.getClass();
        userName.getClass();
        type.getClass();
        token.getClass();
        tokenSecret.getClass();
        imageUrl.getClass();
        nickname.getClass();
        chatRole.getClass();
        providerType.getClass();
        unknownFields.getClass();
        return new UserAccount(id, userName, type, token, tokenSecret, isLoggedIn, hasServerAds, imageUrl, nickname, purchasedAds, devMod, forceAds, showTestRating, joinDate, chatRole, chatFlag, editorName, isEditor, previousLeaderboardId, leaderboardId, maxLeaderboardLevel, syncTimestamp, chatUsernameColor, isActiveCrowdsourcer, credibilityScore, fantasyUser, forceHideAds, userBadge, weeklyChallengeDailyBonusUsedAtTimestamp, providerType, hasPremium, dataSharingOptOut, premiumTokenExpirationTimestamp, unknownFields);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserAccount)) {
            return false;
        }
        UserAccount userAccount = (UserAccount) other;
        return Intrinsics.c(unknownFields(), userAccount.unknownFields()) && Intrinsics.c(this.id, userAccount.id) && Intrinsics.c(this.userName, userAccount.userName) && Intrinsics.c(this.type, userAccount.type) && Intrinsics.c(this.token, userAccount.token) && Intrinsics.c(this.tokenSecret, userAccount.tokenSecret) && this.isLoggedIn == userAccount.isLoggedIn && this.hasServerAds == userAccount.hasServerAds && Intrinsics.c(this.imageUrl, userAccount.imageUrl) && Intrinsics.c(this.nickname, userAccount.nickname) && this.purchasedAds == userAccount.purchasedAds && this.devMod == userAccount.devMod && this.forceAds == userAccount.forceAds && this.showTestRating == userAccount.showTestRating && this.joinDate == userAccount.joinDate && Intrinsics.c(this.chatRole, userAccount.chatRole) && Intrinsics.c(this.chatFlag, userAccount.chatFlag) && Intrinsics.c(this.editorName, userAccount.editorName) && this.isEditor == userAccount.isEditor && this.previousLeaderboardId == userAccount.previousLeaderboardId && this.leaderboardId == userAccount.leaderboardId && this.maxLeaderboardLevel == userAccount.maxLeaderboardLevel && this.syncTimestamp == userAccount.syncTimestamp && Intrinsics.c(this.chatUsernameColor, userAccount.chatUsernameColor) && this.isActiveCrowdsourcer == userAccount.isActiveCrowdsourcer && this.credibilityScore == userAccount.credibilityScore && this.fantasyUser == userAccount.fantasyUser && this.forceHideAds == userAccount.forceHideAds && Intrinsics.c(this.userBadge, userAccount.userBadge) && this.weeklyChallengeDailyBonusUsedAtTimestamp == userAccount.weeklyChallengeDailyBonusUsedAtTimestamp && Intrinsics.c(this.providerType, userAccount.providerType) && Intrinsics.c(this.hasPremium, userAccount.hasPremium) && Intrinsics.c(this.dataSharingOptOut, userAccount.dataSharingOptOut) && Intrinsics.c(this.premiumTokenExpirationTimestamp, userAccount.premiumTokenExpirationTimestamp);
    }

    @Nullable
    public final String getChatFlag() {
        return this.chatFlag;
    }

    @NotNull
    public final String getChatRole() {
        return this.chatRole;
    }

    @Nullable
    public final String getChatUsernameColor() {
        return this.chatUsernameColor;
    }

    public final float getCredibilityScore() {
        return this.credibilityScore;
    }

    @Nullable
    public final Boolean getDataSharingOptOut() {
        return this.dataSharingOptOut;
    }

    public final boolean getDevMod() {
        return this.devMod;
    }

    @Nullable
    public final String getEditorName() {
        return this.editorName;
    }

    public final boolean getFantasyUser() {
        return this.fantasyUser;
    }

    public final boolean getForceAds() {
        return this.forceAds;
    }

    public final boolean getForceHideAds() {
        return this.forceHideAds;
    }

    @Nullable
    public final Boolean getHasPremium() {
        return this.hasPremium;
    }

    public final boolean getHasServerAds() {
        return this.hasServerAds;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getJoinDate() {
        return this.joinDate;
    }

    public final int getLeaderboardId() {
        return this.leaderboardId;
    }

    public final int getMaxLeaderboardLevel() {
        return this.maxLeaderboardLevel;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final Long getPremiumTokenExpirationTimestamp() {
        return this.premiumTokenExpirationTimestamp;
    }

    public final int getPreviousLeaderboardId() {
        return this.previousLeaderboardId;
    }

    @NotNull
    public final String getProviderType() {
        return this.providerType;
    }

    public final boolean getPurchasedAds() {
        return this.purchasedAds;
    }

    public final boolean getShowTestRating() {
        return this.showTestRating;
    }

    public final long getSyncTimestamp() {
        return this.syncTimestamp;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getTokenSecret() {
        return this.tokenSecret;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUserBadge() {
        return this.userBadge;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final long getWeeklyChallengeDailyBonusUsedAtTimestamp() {
        return this.weeklyChallengeDailyBonusUsedAtTimestamp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int c = dmi.c(ljg.c(dmi.e(dmi.e(dmi.e(dmi.e(dmi.c(dmi.c(dmi.e(dmi.e(dmi.c(dmi.c(dmi.c(dmi.c(dmi.c(unknownFields().hashCode() * 37, 37, this.id), 37, this.userName), 37, this.type), 37, this.token), 37, this.tokenSecret), 37, this.isLoggedIn), 37, this.hasServerAds), 37, this.imageUrl), 37, this.nickname), 37, this.purchasedAds), 37, this.devMod), 37, this.forceAds), 37, this.showTestRating), 37, this.joinDate), 37, this.chatRole);
        String str = this.chatFlag;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.editorName;
        int c2 = ljg.c(wv8.a(this.maxLeaderboardLevel, wv8.a(this.leaderboardId, wv8.a(this.previousLeaderboardId, dmi.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.isEditor), 37), 37), 37), 37, this.syncTimestamp);
        String str3 = this.chatUsernameColor;
        int e = dmi.e(dmi.e(fc6.a(this.credibilityScore, dmi.e((c2 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.isActiveCrowdsourcer), 37), 37, this.fantasyUser), 37, this.forceHideAds);
        String str4 = this.userBadge;
        int c3 = dmi.c(ljg.c((e + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.weeklyChallengeDailyBonusUsedAtTimestamp), 37, this.providerType);
        Boolean bool = this.hasPremium;
        int hashCode2 = (c3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.dataSharingOptOut;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Long l = this.premiumTokenExpirationTimestamp;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    /* renamed from: isActiveCrowdsourcer, reason: from getter */
    public final boolean getIsActiveCrowdsourcer() {
        return this.isActiveCrowdsourcer;
    }

    /* renamed from: isEditor, reason: from getter */
    public final boolean getIsEditor() {
        return this.isEditor;
    }

    /* renamed from: isLoggedIn, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m688newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        mz1.A(arrayList, "id=", Internal.sanitize(this.id));
        mz1.A(arrayList, "userName=", Internal.sanitize(this.userName));
        mz1.A(arrayList, "type=", Internal.sanitize(this.type));
        mz1.A(arrayList, "token=", Internal.sanitize(this.token));
        mz1.A(arrayList, "tokenSecret=", Internal.sanitize(this.tokenSecret));
        arrayList.add("isLoggedIn=" + this.isLoggedIn);
        arrayList.add("hasServerAds=" + this.hasServerAds);
        mz1.A(arrayList, "imageUrl=", Internal.sanitize(this.imageUrl));
        mz1.A(arrayList, "nickname=", Internal.sanitize(this.nickname));
        arrayList.add("purchasedAds=" + this.purchasedAds);
        arrayList.add("devMod=" + this.devMod);
        arrayList.add("forceAds=" + this.forceAds);
        arrayList.add("showTestRating=" + this.showTestRating);
        arrayList.add("joinDate=" + this.joinDate);
        mz1.A(arrayList, "chatRole=", Internal.sanitize(this.chatRole));
        String str = this.chatFlag;
        if (str != null) {
            mz1.A(arrayList, "chatFlag=", Internal.sanitize(str));
        }
        String str2 = this.editorName;
        if (str2 != null) {
            mz1.A(arrayList, "editorName=", Internal.sanitize(str2));
        }
        arrayList.add("isEditor=" + this.isEditor);
        arrayList.add("previousLeaderboardId=" + this.previousLeaderboardId);
        arrayList.add("leaderboardId=" + this.leaderboardId);
        arrayList.add("maxLeaderboardLevel=" + this.maxLeaderboardLevel);
        arrayList.add("syncTimestamp=" + this.syncTimestamp);
        String str3 = this.chatUsernameColor;
        if (str3 != null) {
            mz1.A(arrayList, "chatUsernameColor=", Internal.sanitize(str3));
        }
        arrayList.add("isActiveCrowdsourcer=" + this.isActiveCrowdsourcer);
        arrayList.add("credibilityScore=" + this.credibilityScore);
        arrayList.add("fantasyUser=" + this.fantasyUser);
        arrayList.add("forceHideAds=" + this.forceHideAds);
        String str4 = this.userBadge;
        if (str4 != null) {
            mz1.A(arrayList, "userBadge=", Internal.sanitize(str4));
        }
        arrayList.add("weeklyChallengeDailyBonusUsedAtTimestamp=" + this.weeklyChallengeDailyBonusUsedAtTimestamp);
        mz1.A(arrayList, "providerType=", Internal.sanitize(this.providerType));
        Boolean bool = this.hasPremium;
        if (bool != null) {
            mz1.y("hasPremium=", bool, arrayList);
        }
        Boolean bool2 = this.dataSharingOptOut;
        if (bool2 != null) {
            mz1.y("dataSharingOptOut=", bool2, arrayList);
        }
        Long l = this.premiumTokenExpirationTimestamp;
        if (l != null) {
            arrayList.add("premiumTokenExpirationTimestamp=" + l);
        }
        return CollectionsKt.f0(arrayList, ", ", "UserAccount{", "}", null, 56);
    }

    public UserAccount() {
        this(null, null, null, null, null, false, false, null, null, false, false, false, false, 0L, null, null, null, false, 0, 0, 0, 0L, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, 0L, null, null, null, null, null, -1, 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, @NotNull String str6, @NotNull String str7, boolean z3, boolean z4, boolean z5, boolean z6, long j, @NotNull String str8, @Nullable String str9, @Nullable String str10, boolean z7, int i, int i2, int i3, long j2, @Nullable String str11, boolean z8, float f, boolean z9, boolean z10, @Nullable String str12, long j3, @NotNull String str13, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2Var);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str13.getClass();
        gc2Var.getClass();
        this.id = str;
        this.userName = str2;
        this.type = str3;
        this.token = str4;
        this.tokenSecret = str5;
        this.isLoggedIn = z;
        this.hasServerAds = z2;
        this.imageUrl = str6;
        this.nickname = str7;
        this.purchasedAds = z3;
        this.devMod = z4;
        this.forceAds = z5;
        this.showTestRating = z6;
        this.joinDate = j;
        this.chatRole = str8;
        this.chatFlag = str9;
        this.editorName = str10;
        this.isEditor = z7;
        this.previousLeaderboardId = i;
        this.leaderboardId = i2;
        this.maxLeaderboardLevel = i3;
        this.syncTimestamp = j2;
        this.chatUsernameColor = str11;
        this.isActiveCrowdsourcer = z8;
        this.credibilityScore = f;
        this.fantasyUser = z9;
        this.forceHideAds = z10;
        this.userBadge = str12;
        this.weeklyChallengeDailyBonusUsedAtTimestamp = j3;
        this.providerType = str13;
        this.hasPremium = bool;
        this.dataSharingOptOut = bool2;
        this.premiumTokenExpirationTimestamp = l;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m688newBuilder();
    }
}
