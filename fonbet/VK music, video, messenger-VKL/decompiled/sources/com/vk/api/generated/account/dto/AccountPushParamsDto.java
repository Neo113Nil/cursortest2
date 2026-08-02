package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountPushParamsDto.kt */
/* loaded from: classes14.dex */
public final class AccountPushParamsDto implements Parcelable {
    public static final Parcelable.Creator<AccountPushParamsDto> CREATOR = new a();

    @pmi0(b.JSON_KEY_ADS)
    private final List<String> ads;

    @pmi0("app_request")
    private final List<AccountPushParamsOnoffDto> appRequest;

    @pmi0("associated_events")
    private final List<String> associatedEvents;

    @pmi0("author_mention")
    private final List<String> authorMention;

    @pmi0("birthday")
    private final List<AccountPushParamsOnoffDto> birthday;

    @pmi0("board_post")
    private final List<String> boardPost;

    @pmi0("bugtracker_events")
    private final List<String> bugtrackerEvents;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    private final List<String> call;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final List<AccountPushParamsModeDto> channels;

    @pmi0("chat")
    private final List<AccountPushParamsModeDto> chat;

    @pmi0("chat_mention")
    private final List<String> chatMention;

    @pmi0("comment")
    private final List<AccountPushParamsSettingsDto> comment;

    @pmi0("comment_commented")
    private final List<String> commentCommented;

    @pmi0("comment_mention")
    private final List<String> commentMention;

    @pmi0("community_msg")
    private final List<AccountPushParamsModeDto> communityMsg;

    @pmi0("content_achievements")
    private final List<String> contentAchievements;

    @pmi0("custom")
    private final List<String> custom;

    @pmi0("erase")
    private final List<String> erase;

    @pmi0("erase_message")
    private final List<String> eraseMessage;

    @pmi0("erase_messages")
    private final List<String> eraseMessages;

    @pmi0("event_soon")
    private final List<AccountPushParamsOnoffDto> eventSoon;

    @pmi0("friend")
    private final List<AccountPushParamsOnoffDto> friend;

    @pmi0("friend_accepted")
    private final List<AccountPushParamsOnoffDto> friendAccepted;

    @pmi0("friend_found")
    private final List<AccountPushParamsOnoffDto> friendFound;

    @pmi0("gift")
    private final List<String> gift;

    @pmi0("group_accepted")
    private final List<AccountPushParamsOnoffDto> groupAccepted;

    @pmi0("group_invite")
    private final List<AccountPushParamsOnoffDto> groupInvite;

    @pmi0("group_main_admin")
    private final List<String> groupMainAdmin;

    @pmi0("interest_post")
    private final List<String> interestPost;

    @pmi0("invited_friend_found")
    private final List<String> invitedFriendFound;

    @pmi0("join_request")
    private final List<String> joinRequest;

    @pmi0("like")
    private final List<AccountPushParamsSettingsDto> like;

    @pmi0("live")
    private final List<String> live;

    @pmi0("live_notify")
    private final List<String> liveNotify;

    @pmi0("live_start")
    private final List<String> liveStart;

    @pmi0("login")
    private final List<String> login;

    @pmi0("marketing")
    private final List<String> marketing;

    @pmi0("mask")
    private final List<String> mask;

    @pmi0("mention")
    private final List<AccountPushParamsSettingsDto> mention;

    @pmi0("message_new")
    private final List<String> messageNew;

    @pmi0("message_request")
    private final List<String> messageRequest;

    @pmi0("message_request_accepted")
    private final List<String> messageRequestAccepted;

    @pmi0(NotificationCompat.CATEGORY_MISSED_CALL)
    private final List<String> missedCall;

    @pmi0("money")
    private final List<String> money;

    @pmi0("money_request")
    private final List<String> moneyRequest;

    @pmi0("money_send")
    private final List<String> moneySend;

    @pmi0("money_transfer_old")
    private final List<String> moneyTransferOld;

    @pmi0(NotificationCompat.CATEGORY_MESSAGE)
    private final List<AccountPushParamsModeDto> msg;

    @pmi0("msg_reaction_set")
    private final List<AccountPushParamsModeDto> msgReactionSet;

    @pmi0("new_audio_album")
    private final List<String> newAudioAlbum;

    @pmi0("new_post")
    private final List<AccountPushParamsOnoffDto> newPost;

    @pmi0("new_user")
    private final List<String> newUser;

    @pmi0("open_url")
    private final List<String> openUrl;

    @pmi0("photo_comment")
    private final List<String> photoComment;

    @pmi0("podcasts")
    private final List<String> podcasts;

    @pmi0("post_comment")
    private final List<String> postComment;

    @pmi0("private_group_post")
    private final List<String> privateGroupPost;

    @pmi0(NotificationCompat.CATEGORY_REMINDER)
    private final List<String> reminder;

    @pmi0("reply")
    private final List<AccountPushParamsOnoffDto> reply;

    @pmi0("repost")
    private final List<AccountPushParamsSettingsDto> repost;

    @pmi0("sdk_open")
    private final List<AccountPushParamsOnoffDto> sdkOpen;

    @pmi0("show_message")
    private final List<String> showMessage;

    @pmi0("sq_actions")
    private final List<String> sqActions;

    @pmi0("sq_anytime_reminder")
    private final List<String> sqAnytimeReminder;

    @pmi0("sq_anytime_result")
    private final List<String> sqAnytimeResult;

    @pmi0("sq_anytime_start_game")
    private final List<String> sqAnytimeStartGame;

    @pmi0("sq_game")
    private final List<String> sqGame;

    @pmi0("sq_greeting")
    private final List<String> sqGreeting;

    @pmi0("sq_store")
    private final List<String> sqStore;

    @pmi0("story_answered")
    private final List<String> storyAnswered;

    @pmi0("story_asked")
    private final List<String> storyAsked;

    @pmi0("story_long_time")
    private final List<String> storyLongTime;

    @pmi0("story_mention")
    private final List<String> storyMention;

    @pmi0("story_question_asked")
    private final List<String> storyQuestionAsked;

    @pmi0("story_reply")
    private final List<String> storyReply;

    @pmi0("suggested_post")
    private final List<String> suggestedPost;

    @pmi0("tag_photo")
    private final List<String> tagPhoto;

    @pmi0("va_content_ready")
    private final List<String> vaContentReady;

    @pmi0("va_game_score_beat")
    private final List<String> vaGameScoreBeat;

    @pmi0("va_pin_personal_video")
    private final List<String> vaPinPersonalVideo;

    @pmi0("va_pushes_badge")
    private final List<String> vaPushesBadge;

    @pmi0("validate_action")
    private final List<String> validateAction;

    @pmi0("validate_device")
    private final List<String> validateDevice;

    @pmi0("vk_apps_open_url")
    private final List<String> vkAppsOpenUrl;

    @pmi0("vk_pay_transaction")
    private final List<String> vkPayTransaction;

    @pmi0("wall_mention")
    private final List<String> wallMention;

    @pmi0("wall_post")
    private final List<AccountPushParamsOnoffDto> wallPost;

    @pmi0("wall_post_copyright_mention")
    private final List<String> wallPostCopyrightMention;

    @pmi0("wall_publish")
    private final List<AccountPushParamsOnoffDto> wallPublish;

    /* compiled from: AccountPushParamsDto.kt */
    public static final class a implements Parcelable.Creator<AccountPushParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPushParamsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            ArrayList arrayList17;
            ArrayList arrayList18;
            ArrayList arrayList19;
            ArrayList arrayList20;
            ArrayList arrayList21;
            int i = 0;
            ArrayList arrayList22 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(AccountPushParamsModeDto.CREATOR, parcel, arrayList23, i2, 1);
                }
                arrayList = arrayList23;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList24 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(AccountPushParamsModeDto.CREATOR, parcel, arrayList24, i3, 1);
                }
                arrayList2 = arrayList24;
            }
            ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList25 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(AccountPushParamsSettingsDto.CREATOR, parcel, arrayList25, i4, 1);
                }
                arrayList3 = arrayList25;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList26 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(AccountPushParamsSettingsDto.CREATOR, parcel, arrayList26, i5, 1);
                }
                arrayList4 = arrayList26;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList27 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = en.a(AccountPushParamsSettingsDto.CREATOR, parcel, arrayList27, i6, 1);
                }
                arrayList5 = arrayList27;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList28 = new ArrayList(readInt6);
                int i7 = 0;
                while (i7 != readInt6) {
                    i7 = en.a(AccountPushParamsSettingsDto.CREATOR, parcel, arrayList28, i7, 1);
                }
                arrayList6 = arrayList28;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                ArrayList arrayList29 = new ArrayList(readInt7);
                int i8 = 0;
                while (i8 != readInt7) {
                    i8 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList29, i8, 1);
                }
                arrayList7 = arrayList29;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int readInt8 = parcel.readInt();
                ArrayList arrayList30 = new ArrayList(readInt8);
                int i9 = 0;
                while (i9 != readInt8) {
                    i9 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList30, i9, 1);
                }
                arrayList8 = arrayList30;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt9 = parcel.readInt();
                ArrayList arrayList31 = new ArrayList(readInt9);
                int i10 = 0;
                while (i10 != readInt9) {
                    i10 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList31, i10, 1);
                }
                arrayList9 = arrayList31;
            }
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int readInt10 = parcel.readInt();
                ArrayList arrayList32 = new ArrayList(readInt10);
                int i11 = 0;
                while (i11 != readInt10) {
                    i11 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList32, i11, 1);
                }
                arrayList10 = arrayList32;
            }
            ArrayList<String> createStringArrayList8 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList9 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int readInt11 = parcel.readInt();
                ArrayList arrayList33 = new ArrayList(readInt11);
                int i12 = 0;
                while (i12 != readInt11) {
                    i12 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList33, i12, 1);
                }
                arrayList11 = arrayList33;
            }
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int readInt12 = parcel.readInt();
                ArrayList arrayList34 = new ArrayList(readInt12);
                int i13 = 0;
                while (i13 != readInt12) {
                    i13 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList34, i13, 1);
                }
                arrayList12 = arrayList34;
            }
            ArrayList<String> createStringArrayList10 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int readInt13 = parcel.readInt();
                ArrayList arrayList35 = new ArrayList(readInt13);
                int i14 = 0;
                while (i14 != readInt13) {
                    i14 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList35, i14, 1);
                }
                arrayList13 = arrayList35;
            }
            if (parcel.readInt() == 0) {
                arrayList14 = null;
            } else {
                int readInt14 = parcel.readInt();
                ArrayList arrayList36 = new ArrayList(readInt14);
                int i15 = 0;
                while (i15 != readInt14) {
                    i15 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList36, i15, 1);
                }
                arrayList14 = arrayList36;
            }
            if (parcel.readInt() == 0) {
                arrayList15 = null;
            } else {
                int readInt15 = parcel.readInt();
                ArrayList arrayList37 = new ArrayList(readInt15);
                int i16 = 0;
                while (i16 != readInt15) {
                    i16 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList37, i16, 1);
                }
                arrayList15 = arrayList37;
            }
            ArrayList<String> createStringArrayList11 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList12 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList16 = null;
            } else {
                int readInt16 = parcel.readInt();
                ArrayList arrayList38 = new ArrayList(readInt16);
                int i17 = 0;
                while (i17 != readInt16) {
                    i17 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList38, i17, 1);
                }
                arrayList16 = arrayList38;
            }
            if (parcel.readInt() == 0) {
                arrayList17 = null;
            } else {
                int readInt17 = parcel.readInt();
                ArrayList arrayList39 = new ArrayList(readInt17);
                int i18 = 0;
                while (i18 != readInt17) {
                    i18 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList39, i18, 1);
                }
                arrayList17 = arrayList39;
            }
            if (parcel.readInt() == 0) {
                arrayList18 = null;
            } else {
                int readInt18 = parcel.readInt();
                ArrayList arrayList40 = new ArrayList(readInt18);
                int i19 = 0;
                while (i19 != readInt18) {
                    i19 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList40, i19, 1);
                }
                arrayList18 = arrayList40;
            }
            if (parcel.readInt() == 0) {
                arrayList19 = null;
            } else {
                int readInt19 = parcel.readInt();
                ArrayList arrayList41 = new ArrayList(readInt19);
                int i20 = 0;
                while (i20 != readInt19) {
                    i20 = en.a(AccountPushParamsOnoffDto.CREATOR, parcel, arrayList41, i20, 1);
                }
                arrayList19 = arrayList41;
            }
            ArrayList<String> createStringArrayList13 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList14 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList15 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList16 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList17 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList18 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList19 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList20 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList21 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList22 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList23 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList24 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList25 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList26 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList27 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList28 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList29 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList30 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList31 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList32 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList33 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList34 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList35 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList36 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList37 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList38 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList39 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList40 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList41 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList42 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList43 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList44 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList45 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList46 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList47 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList48 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList49 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList50 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList51 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList52 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList53 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList54 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList55 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList56 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList57 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList58 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList59 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList60 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList61 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList62 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList63 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList64 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList65 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList66 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList67 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList20 = null;
            } else {
                int readInt20 = parcel.readInt();
                ArrayList arrayList42 = new ArrayList(readInt20);
                int i21 = 0;
                while (i21 != readInt20) {
                    i21 = en.a(AccountPushParamsModeDto.CREATOR, parcel, arrayList42, i21, 1);
                }
                arrayList20 = arrayList42;
            }
            if (parcel.readInt() == 0) {
                arrayList21 = null;
            } else {
                int readInt21 = parcel.readInt();
                ArrayList arrayList43 = new ArrayList(readInt21);
                int i22 = 0;
                while (i22 != readInt21) {
                    i22 = en.a(AccountPushParamsModeDto.CREATOR, parcel, arrayList43, i22, 1);
                }
                arrayList21 = arrayList43;
            }
            if (parcel.readInt() != 0) {
                int readInt22 = parcel.readInt();
                arrayList22 = new ArrayList(readInt22);
                while (i != readInt22) {
                    i = en.a(AccountPushParamsModeDto.CREATOR, parcel, arrayList22, i, 1);
                }
            }
            return new AccountPushParamsDto(arrayList, createStringArrayList, createStringArrayList2, createStringArrayList3, createStringArrayList4, createStringArrayList5, createStringArrayList6, arrayList2, createStringArrayList7, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, createStringArrayList8, createStringArrayList9, arrayList11, arrayList12, createStringArrayList10, arrayList13, arrayList14, arrayList15, createStringArrayList11, createStringArrayList12, arrayList16, arrayList17, arrayList18, arrayList19, createStringArrayList13, createStringArrayList14, createStringArrayList15, createStringArrayList16, createStringArrayList17, createStringArrayList18, createStringArrayList19, createStringArrayList20, createStringArrayList21, createStringArrayList22, createStringArrayList23, createStringArrayList24, createStringArrayList25, createStringArrayList26, createStringArrayList27, createStringArrayList28, createStringArrayList29, createStringArrayList30, createStringArrayList31, createStringArrayList32, createStringArrayList33, createStringArrayList34, createStringArrayList35, createStringArrayList36, createStringArrayList37, createStringArrayList38, createStringArrayList39, createStringArrayList40, createStringArrayList41, createStringArrayList42, createStringArrayList43, createStringArrayList44, createStringArrayList45, createStringArrayList46, createStringArrayList47, createStringArrayList48, createStringArrayList49, createStringArrayList50, createStringArrayList51, createStringArrayList52, createStringArrayList53, createStringArrayList54, createStringArrayList55, createStringArrayList56, createStringArrayList57, createStringArrayList58, createStringArrayList59, createStringArrayList60, createStringArrayList61, createStringArrayList62, createStringArrayList63, createStringArrayList64, createStringArrayList65, createStringArrayList66, createStringArrayList67, arrayList20, arrayList21, arrayList22);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPushParamsDto[] newArray(int i) {
            return new AccountPushParamsDto[i];
        }
    }

    public AccountPushParamsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 33554431, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushParamsDto)) {
            return false;
        }
        AccountPushParamsDto accountPushParamsDto = (AccountPushParamsDto) obj;
        return epx.f(this.msg, accountPushParamsDto.msg) && epx.f(this.messageNew, accountPushParamsDto.messageNew) && epx.f(this.gift, accountPushParamsDto.gift) && epx.f(this.money, accountPushParamsDto.money) && epx.f(this.moneyTransferOld, accountPushParamsDto.moneyTransferOld) && epx.f(this.moneySend, accountPushParamsDto.moneySend) && epx.f(this.moneyRequest, accountPushParamsDto.moneyRequest) && epx.f(this.chat, accountPushParamsDto.chat) && epx.f(this.chatMention, accountPushParamsDto.chatMention) && epx.f(this.like, accountPushParamsDto.like) && epx.f(this.repost, accountPushParamsDto.repost) && epx.f(this.comment, accountPushParamsDto.comment) && epx.f(this.mention, accountPushParamsDto.mention) && epx.f(this.reply, accountPushParamsDto.reply) && epx.f(this.newPost, accountPushParamsDto.newPost) && epx.f(this.wallPost, accountPushParamsDto.wallPost) && epx.f(this.wallPublish, accountPushParamsDto.wallPublish) && epx.f(this.interestPost, accountPushParamsDto.interestPost) && epx.f(this.storyLongTime, accountPushParamsDto.storyLongTime) && epx.f(this.friend, accountPushParamsDto.friend) && epx.f(this.friendFound, accountPushParamsDto.friendFound) && epx.f(this.invitedFriendFound, accountPushParamsDto.invitedFriendFound) && epx.f(this.friendAccepted, accountPushParamsDto.friendAccepted) && epx.f(this.groupInvite, accountPushParamsDto.groupInvite) && epx.f(this.groupAccepted, accountPushParamsDto.groupAccepted) && epx.f(this.groupMainAdmin, accountPushParamsDto.groupMainAdmin) && epx.f(this.tagPhoto, accountPushParamsDto.tagPhoto) && epx.f(this.birthday, accountPushParamsDto.birthday) && epx.f(this.eventSoon, accountPushParamsDto.eventSoon) && epx.f(this.appRequest, accountPushParamsDto.appRequest) && epx.f(this.sdkOpen, accountPushParamsDto.sdkOpen) && epx.f(this.ads, accountPushParamsDto.ads) && epx.f(this.live, accountPushParamsDto.live) && epx.f(this.login, accountPushParamsDto.login) && epx.f(this.validateDevice, accountPushParamsDto.validateDevice) && epx.f(this.validateAction, accountPushParamsDto.validateAction) && epx.f(this.storyReply, accountPushParamsDto.storyReply) && epx.f(this.storyAsked, accountPushParamsDto.storyAsked) && epx.f(this.storyAnswered, accountPushParamsDto.storyAnswered) && epx.f(this.mask, accountPushParamsDto.mask) && epx.f(this.call, accountPushParamsDto.call) && epx.f(this.missedCall, accountPushParamsDto.missedCall) && epx.f(this.newUser, accountPushParamsDto.newUser) && epx.f(this.privateGroupPost, accountPushParamsDto.privateGroupPost) && epx.f(this.associatedEvents, accountPushParamsDto.associatedEvents) && epx.f(this.bugtrackerEvents, accountPushParamsDto.bugtrackerEvents) && epx.f(this.newAudioAlbum, accountPushParamsDto.newAudioAlbum) && epx.f(this.marketing, accountPushParamsDto.marketing) && epx.f(this.vkAppsOpenUrl, accountPushParamsDto.vkAppsOpenUrl) && epx.f(this.contentAchievements, accountPushParamsDto.contentAchievements) && epx.f(this.podcasts, accountPushParamsDto.podcasts) && epx.f(this.commentCommented, accountPushParamsDto.commentCommented) && epx.f(this.reminder, accountPushParamsDto.reminder) && epx.f(this.custom, accountPushParamsDto.custom) && epx.f(this.openUrl, accountPushParamsDto.openUrl) && epx.f(this.showMessage, accountPushParamsDto.showMessage) && epx.f(this.erase, accountPushParamsDto.erase) && epx.f(this.eraseMessage, accountPushParamsDto.eraseMessage) && epx.f(this.eraseMessages, accountPushParamsDto.eraseMessages) && epx.f(this.liveStart, accountPushParamsDto.liveStart) && epx.f(this.liveNotify, accountPushParamsDto.liveNotify) && epx.f(this.postComment, accountPushParamsDto.postComment) && epx.f(this.suggestedPost, accountPushParamsDto.suggestedPost) && epx.f(this.wallMention, accountPushParamsDto.wallMention) && epx.f(this.commentMention, accountPushParamsDto.commentMention) && epx.f(this.photoComment, accountPushParamsDto.photoComment) && epx.f(this.boardPost, accountPushParamsDto.boardPost) && epx.f(this.joinRequest, accountPushParamsDto.joinRequest) && epx.f(this.storyMention, accountPushParamsDto.storyMention) && epx.f(this.wallPostCopyrightMention, accountPushParamsDto.wallPostCopyrightMention) && epx.f(this.storyQuestionAsked, accountPushParamsDto.storyQuestionAsked) && epx.f(this.vkPayTransaction, accountPushParamsDto.vkPayTransaction) && epx.f(this.sqGame, accountPushParamsDto.sqGame) && epx.f(this.sqStore, accountPushParamsDto.sqStore) && epx.f(this.sqActions, accountPushParamsDto.sqActions) && epx.f(this.sqGreeting, accountPushParamsDto.sqGreeting) && epx.f(this.sqAnytimeReminder, accountPushParamsDto.sqAnytimeReminder) && epx.f(this.sqAnytimeStartGame, accountPushParamsDto.sqAnytimeStartGame) && epx.f(this.sqAnytimeResult, accountPushParamsDto.sqAnytimeResult) && epx.f(this.vaPinPersonalVideo, accountPushParamsDto.vaPinPersonalVideo) && epx.f(this.vaGameScoreBeat, accountPushParamsDto.vaGameScoreBeat) && epx.f(this.vaPushesBadge, accountPushParamsDto.vaPushesBadge) && epx.f(this.vaContentReady, accountPushParamsDto.vaContentReady) && epx.f(this.messageRequest, accountPushParamsDto.messageRequest) && epx.f(this.messageRequestAccepted, accountPushParamsDto.messageRequestAccepted) && epx.f(this.authorMention, accountPushParamsDto.authorMention) && epx.f(this.communityMsg, accountPushParamsDto.communityMsg) && epx.f(this.msgReactionSet, accountPushParamsDto.msgReactionSet) && epx.f(this.channels, accountPushParamsDto.channels);
    }

    public final int hashCode() {
        List<AccountPushParamsModeDto> list = this.msg;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.messageNew;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.gift;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.money;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.moneyTransferOld;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.moneySend;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.moneyRequest;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<AccountPushParamsModeDto> list8 = this.chat;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<String> list9 = this.chatMention;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list10 = this.like;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list11 = this.repost;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list12 = this.comment;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<AccountPushParamsSettingsDto> list13 = this.mention;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list14 = this.reply;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list15 = this.newPost;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list16 = this.wallPost;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list17 = this.wallPublish;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<String> list18 = this.interestPost;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<String> list19 = this.storyLongTime;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list20 = this.friend;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list21 = this.friendFound;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<String> list22 = this.invitedFriendFound;
        int hashCode22 = (hashCode21 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list23 = this.friendAccepted;
        int hashCode23 = (hashCode22 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list24 = this.groupInvite;
        int hashCode24 = (hashCode23 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list25 = this.groupAccepted;
        int hashCode25 = (hashCode24 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<String> list26 = this.groupMainAdmin;
        int hashCode26 = (hashCode25 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<String> list27 = this.tagPhoto;
        int hashCode27 = (hashCode26 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list28 = this.birthday;
        int hashCode28 = (hashCode27 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list29 = this.eventSoon;
        int hashCode29 = (hashCode28 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list30 = this.appRequest;
        int hashCode30 = (hashCode29 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<AccountPushParamsOnoffDto> list31 = this.sdkOpen;
        int hashCode31 = (hashCode30 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<String> list32 = this.ads;
        int hashCode32 = (hashCode31 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<String> list33 = this.live;
        int hashCode33 = (hashCode32 + (list33 == null ? 0 : list33.hashCode())) * 31;
        List<String> list34 = this.login;
        int hashCode34 = (hashCode33 + (list34 == null ? 0 : list34.hashCode())) * 31;
        List<String> list35 = this.validateDevice;
        int hashCode35 = (hashCode34 + (list35 == null ? 0 : list35.hashCode())) * 31;
        List<String> list36 = this.validateAction;
        int hashCode36 = (hashCode35 + (list36 == null ? 0 : list36.hashCode())) * 31;
        List<String> list37 = this.storyReply;
        int hashCode37 = (hashCode36 + (list37 == null ? 0 : list37.hashCode())) * 31;
        List<String> list38 = this.storyAsked;
        int hashCode38 = (hashCode37 + (list38 == null ? 0 : list38.hashCode())) * 31;
        List<String> list39 = this.storyAnswered;
        int hashCode39 = (hashCode38 + (list39 == null ? 0 : list39.hashCode())) * 31;
        List<String> list40 = this.mask;
        int hashCode40 = (hashCode39 + (list40 == null ? 0 : list40.hashCode())) * 31;
        List<String> list41 = this.call;
        int hashCode41 = (hashCode40 + (list41 == null ? 0 : list41.hashCode())) * 31;
        List<String> list42 = this.missedCall;
        int hashCode42 = (hashCode41 + (list42 == null ? 0 : list42.hashCode())) * 31;
        List<String> list43 = this.newUser;
        int hashCode43 = (hashCode42 + (list43 == null ? 0 : list43.hashCode())) * 31;
        List<String> list44 = this.privateGroupPost;
        int hashCode44 = (hashCode43 + (list44 == null ? 0 : list44.hashCode())) * 31;
        List<String> list45 = this.associatedEvents;
        int hashCode45 = (hashCode44 + (list45 == null ? 0 : list45.hashCode())) * 31;
        List<String> list46 = this.bugtrackerEvents;
        int hashCode46 = (hashCode45 + (list46 == null ? 0 : list46.hashCode())) * 31;
        List<String> list47 = this.newAudioAlbum;
        int hashCode47 = (hashCode46 + (list47 == null ? 0 : list47.hashCode())) * 31;
        List<String> list48 = this.marketing;
        int hashCode48 = (hashCode47 + (list48 == null ? 0 : list48.hashCode())) * 31;
        List<String> list49 = this.vkAppsOpenUrl;
        int hashCode49 = (hashCode48 + (list49 == null ? 0 : list49.hashCode())) * 31;
        List<String> list50 = this.contentAchievements;
        int hashCode50 = (hashCode49 + (list50 == null ? 0 : list50.hashCode())) * 31;
        List<String> list51 = this.podcasts;
        int hashCode51 = (hashCode50 + (list51 == null ? 0 : list51.hashCode())) * 31;
        List<String> list52 = this.commentCommented;
        int hashCode52 = (hashCode51 + (list52 == null ? 0 : list52.hashCode())) * 31;
        List<String> list53 = this.reminder;
        int hashCode53 = (hashCode52 + (list53 == null ? 0 : list53.hashCode())) * 31;
        List<String> list54 = this.custom;
        int hashCode54 = (hashCode53 + (list54 == null ? 0 : list54.hashCode())) * 31;
        List<String> list55 = this.openUrl;
        int hashCode55 = (hashCode54 + (list55 == null ? 0 : list55.hashCode())) * 31;
        List<String> list56 = this.showMessage;
        int hashCode56 = (hashCode55 + (list56 == null ? 0 : list56.hashCode())) * 31;
        List<String> list57 = this.erase;
        int hashCode57 = (hashCode56 + (list57 == null ? 0 : list57.hashCode())) * 31;
        List<String> list58 = this.eraseMessage;
        int hashCode58 = (hashCode57 + (list58 == null ? 0 : list58.hashCode())) * 31;
        List<String> list59 = this.eraseMessages;
        int hashCode59 = (hashCode58 + (list59 == null ? 0 : list59.hashCode())) * 31;
        List<String> list60 = this.liveStart;
        int hashCode60 = (hashCode59 + (list60 == null ? 0 : list60.hashCode())) * 31;
        List<String> list61 = this.liveNotify;
        int hashCode61 = (hashCode60 + (list61 == null ? 0 : list61.hashCode())) * 31;
        List<String> list62 = this.postComment;
        int hashCode62 = (hashCode61 + (list62 == null ? 0 : list62.hashCode())) * 31;
        List<String> list63 = this.suggestedPost;
        int hashCode63 = (hashCode62 + (list63 == null ? 0 : list63.hashCode())) * 31;
        List<String> list64 = this.wallMention;
        int hashCode64 = (hashCode63 + (list64 == null ? 0 : list64.hashCode())) * 31;
        List<String> list65 = this.commentMention;
        int hashCode65 = (hashCode64 + (list65 == null ? 0 : list65.hashCode())) * 31;
        List<String> list66 = this.photoComment;
        int hashCode66 = (hashCode65 + (list66 == null ? 0 : list66.hashCode())) * 31;
        List<String> list67 = this.boardPost;
        int hashCode67 = (hashCode66 + (list67 == null ? 0 : list67.hashCode())) * 31;
        List<String> list68 = this.joinRequest;
        int hashCode68 = (hashCode67 + (list68 == null ? 0 : list68.hashCode())) * 31;
        List<String> list69 = this.storyMention;
        int hashCode69 = (hashCode68 + (list69 == null ? 0 : list69.hashCode())) * 31;
        List<String> list70 = this.wallPostCopyrightMention;
        int hashCode70 = (hashCode69 + (list70 == null ? 0 : list70.hashCode())) * 31;
        List<String> list71 = this.storyQuestionAsked;
        int hashCode71 = (hashCode70 + (list71 == null ? 0 : list71.hashCode())) * 31;
        List<String> list72 = this.vkPayTransaction;
        int hashCode72 = (hashCode71 + (list72 == null ? 0 : list72.hashCode())) * 31;
        List<String> list73 = this.sqGame;
        int hashCode73 = (hashCode72 + (list73 == null ? 0 : list73.hashCode())) * 31;
        List<String> list74 = this.sqStore;
        int hashCode74 = (hashCode73 + (list74 == null ? 0 : list74.hashCode())) * 31;
        List<String> list75 = this.sqActions;
        int hashCode75 = (hashCode74 + (list75 == null ? 0 : list75.hashCode())) * 31;
        List<String> list76 = this.sqGreeting;
        int hashCode76 = (hashCode75 + (list76 == null ? 0 : list76.hashCode())) * 31;
        List<String> list77 = this.sqAnytimeReminder;
        int hashCode77 = (hashCode76 + (list77 == null ? 0 : list77.hashCode())) * 31;
        List<String> list78 = this.sqAnytimeStartGame;
        int hashCode78 = (hashCode77 + (list78 == null ? 0 : list78.hashCode())) * 31;
        List<String> list79 = this.sqAnytimeResult;
        int hashCode79 = (hashCode78 + (list79 == null ? 0 : list79.hashCode())) * 31;
        List<String> list80 = this.vaPinPersonalVideo;
        int hashCode80 = (hashCode79 + (list80 == null ? 0 : list80.hashCode())) * 31;
        List<String> list81 = this.vaGameScoreBeat;
        int hashCode81 = (hashCode80 + (list81 == null ? 0 : list81.hashCode())) * 31;
        List<String> list82 = this.vaPushesBadge;
        int hashCode82 = (hashCode81 + (list82 == null ? 0 : list82.hashCode())) * 31;
        List<String> list83 = this.vaContentReady;
        int hashCode83 = (hashCode82 + (list83 == null ? 0 : list83.hashCode())) * 31;
        List<String> list84 = this.messageRequest;
        int hashCode84 = (hashCode83 + (list84 == null ? 0 : list84.hashCode())) * 31;
        List<String> list85 = this.messageRequestAccepted;
        int hashCode85 = (hashCode84 + (list85 == null ? 0 : list85.hashCode())) * 31;
        List<String> list86 = this.authorMention;
        int hashCode86 = (hashCode85 + (list86 == null ? 0 : list86.hashCode())) * 31;
        List<AccountPushParamsModeDto> list87 = this.communityMsg;
        int hashCode87 = (hashCode86 + (list87 == null ? 0 : list87.hashCode())) * 31;
        List<AccountPushParamsModeDto> list88 = this.msgReactionSet;
        int hashCode88 = (hashCode87 + (list88 == null ? 0 : list88.hashCode())) * 31;
        List<AccountPushParamsModeDto> list89 = this.channels;
        return hashCode88 + (list89 != null ? list89.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPushParamsDto(msg=");
        sb.append(this.msg);
        sb.append(", messageNew=");
        sb.append(this.messageNew);
        sb.append(", gift=");
        sb.append(this.gift);
        sb.append(", money=");
        sb.append(this.money);
        sb.append(", moneyTransferOld=");
        sb.append(this.moneyTransferOld);
        sb.append(", moneySend=");
        sb.append(this.moneySend);
        sb.append(", moneyRequest=");
        sb.append(this.moneyRequest);
        sb.append(", chat=");
        sb.append(this.chat);
        sb.append(", chatMention=");
        sb.append(this.chatMention);
        sb.append(", like=");
        sb.append(this.like);
        sb.append(", repost=");
        sb.append(this.repost);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", mention=");
        sb.append(this.mention);
        sb.append(", reply=");
        sb.append(this.reply);
        sb.append(", newPost=");
        sb.append(this.newPost);
        sb.append(", wallPost=");
        sb.append(this.wallPost);
        sb.append(", wallPublish=");
        sb.append(this.wallPublish);
        sb.append(", interestPost=");
        sb.append(this.interestPost);
        sb.append(", storyLongTime=");
        sb.append(this.storyLongTime);
        sb.append(", friend=");
        sb.append(this.friend);
        sb.append(", friendFound=");
        sb.append(this.friendFound);
        sb.append(", invitedFriendFound=");
        sb.append(this.invitedFriendFound);
        sb.append(", friendAccepted=");
        sb.append(this.friendAccepted);
        sb.append(", groupInvite=");
        sb.append(this.groupInvite);
        sb.append(", groupAccepted=");
        sb.append(this.groupAccepted);
        sb.append(", groupMainAdmin=");
        sb.append(this.groupMainAdmin);
        sb.append(", tagPhoto=");
        sb.append(this.tagPhoto);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", eventSoon=");
        sb.append(this.eventSoon);
        sb.append(", appRequest=");
        sb.append(this.appRequest);
        sb.append(", sdkOpen=");
        sb.append(this.sdkOpen);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", live=");
        sb.append(this.live);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", validateDevice=");
        sb.append(this.validateDevice);
        sb.append(", validateAction=");
        sb.append(this.validateAction);
        sb.append(", storyReply=");
        sb.append(this.storyReply);
        sb.append(", storyAsked=");
        sb.append(this.storyAsked);
        sb.append(", storyAnswered=");
        sb.append(this.storyAnswered);
        sb.append(", mask=");
        sb.append(this.mask);
        sb.append(", call=");
        sb.append(this.call);
        sb.append(", missedCall=");
        sb.append(this.missedCall);
        sb.append(", newUser=");
        sb.append(this.newUser);
        sb.append(", privateGroupPost=");
        sb.append(this.privateGroupPost);
        sb.append(", associatedEvents=");
        sb.append(this.associatedEvents);
        sb.append(", bugtrackerEvents=");
        sb.append(this.bugtrackerEvents);
        sb.append(", newAudioAlbum=");
        sb.append(this.newAudioAlbum);
        sb.append(", marketing=");
        sb.append(this.marketing);
        sb.append(", vkAppsOpenUrl=");
        sb.append(this.vkAppsOpenUrl);
        sb.append(", contentAchievements=");
        sb.append(this.contentAchievements);
        sb.append(", podcasts=");
        sb.append(this.podcasts);
        sb.append(", commentCommented=");
        sb.append(this.commentCommented);
        sb.append(", reminder=");
        sb.append(this.reminder);
        sb.append(", custom=");
        sb.append(this.custom);
        sb.append(", openUrl=");
        sb.append(this.openUrl);
        sb.append(", showMessage=");
        sb.append(this.showMessage);
        sb.append(", erase=");
        sb.append(this.erase);
        sb.append(", eraseMessage=");
        sb.append(this.eraseMessage);
        sb.append(", eraseMessages=");
        sb.append(this.eraseMessages);
        sb.append(", liveStart=");
        sb.append(this.liveStart);
        sb.append(", liveNotify=");
        sb.append(this.liveNotify);
        sb.append(", postComment=");
        sb.append(this.postComment);
        sb.append(", suggestedPost=");
        sb.append(this.suggestedPost);
        sb.append(", wallMention=");
        sb.append(this.wallMention);
        sb.append(", commentMention=");
        sb.append(this.commentMention);
        sb.append(", photoComment=");
        sb.append(this.photoComment);
        sb.append(", boardPost=");
        sb.append(this.boardPost);
        sb.append(", joinRequest=");
        sb.append(this.joinRequest);
        sb.append(", storyMention=");
        sb.append(this.storyMention);
        sb.append(", wallPostCopyrightMention=");
        sb.append(this.wallPostCopyrightMention);
        sb.append(", storyQuestionAsked=");
        sb.append(this.storyQuestionAsked);
        sb.append(", vkPayTransaction=");
        sb.append(this.vkPayTransaction);
        sb.append(", sqGame=");
        sb.append(this.sqGame);
        sb.append(", sqStore=");
        sb.append(this.sqStore);
        sb.append(", sqActions=");
        sb.append(this.sqActions);
        sb.append(", sqGreeting=");
        sb.append(this.sqGreeting);
        sb.append(", sqAnytimeReminder=");
        sb.append(this.sqAnytimeReminder);
        sb.append(", sqAnytimeStartGame=");
        sb.append(this.sqAnytimeStartGame);
        sb.append(", sqAnytimeResult=");
        sb.append(this.sqAnytimeResult);
        sb.append(", vaPinPersonalVideo=");
        sb.append(this.vaPinPersonalVideo);
        sb.append(", vaGameScoreBeat=");
        sb.append(this.vaGameScoreBeat);
        sb.append(", vaPushesBadge=");
        sb.append(this.vaPushesBadge);
        sb.append(", vaContentReady=");
        sb.append(this.vaContentReady);
        sb.append(", messageRequest=");
        sb.append(this.messageRequest);
        sb.append(", messageRequestAccepted=");
        sb.append(this.messageRequestAccepted);
        sb.append(", authorMention=");
        sb.append(this.authorMention);
        sb.append(", communityMsg=");
        sb.append(this.communityMsg);
        sb.append(", msgReactionSet=");
        sb.append(this.msgReactionSet);
        sb.append(", channels=");
        return ms9.a(')', sb, this.channels);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AccountPushParamsModeDto> list = this.msg;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountPushParamsModeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.messageNew);
        parcel.writeStringList(this.gift);
        parcel.writeStringList(this.money);
        parcel.writeStringList(this.moneyTransferOld);
        parcel.writeStringList(this.moneySend);
        parcel.writeStringList(this.moneyRequest);
        List<AccountPushParamsModeDto> list2 = this.chat;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AccountPushParamsModeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.chatMention);
        List<AccountPushParamsSettingsDto> list3 = this.like;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((AccountPushParamsSettingsDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsSettingsDto> list4 = this.repost;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((AccountPushParamsSettingsDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsSettingsDto> list5 = this.comment;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((AccountPushParamsSettingsDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsSettingsDto> list6 = this.mention;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((AccountPushParamsSettingsDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list7 = this.reply;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                ((AccountPushParamsOnoffDto) f7.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list8 = this.newPost;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                ((AccountPushParamsOnoffDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list9 = this.wallPost;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                ((AccountPushParamsOnoffDto) f9.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list10 = this.wallPublish;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list10, 1);
            while (f10.hasNext()) {
                ((AccountPushParamsOnoffDto) f10.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.interestPost);
        parcel.writeStringList(this.storyLongTime);
        List<AccountPushParamsOnoffDto> list11 = this.friend;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list11, 1);
            while (f11.hasNext()) {
                ((AccountPushParamsOnoffDto) f11.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list12 = this.friendFound;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list12, 1);
            while (f12.hasNext()) {
                ((AccountPushParamsOnoffDto) f12.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.invitedFriendFound);
        List<AccountPushParamsOnoffDto> list13 = this.friendAccepted;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list13, 1);
            while (f13.hasNext()) {
                ((AccountPushParamsOnoffDto) f13.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list14 = this.groupInvite;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list14, 1);
            while (f14.hasNext()) {
                ((AccountPushParamsOnoffDto) f14.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list15 = this.groupAccepted;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list15, 1);
            while (f15.hasNext()) {
                ((AccountPushParamsOnoffDto) f15.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.groupMainAdmin);
        parcel.writeStringList(this.tagPhoto);
        List<AccountPushParamsOnoffDto> list16 = this.birthday;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list16, 1);
            while (f16.hasNext()) {
                ((AccountPushParamsOnoffDto) f16.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list17 = this.eventSoon;
        if (list17 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f17 = dn.f(parcel, list17, 1);
            while (f17.hasNext()) {
                ((AccountPushParamsOnoffDto) f17.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list18 = this.appRequest;
        if (list18 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f18 = dn.f(parcel, list18, 1);
            while (f18.hasNext()) {
                ((AccountPushParamsOnoffDto) f18.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsOnoffDto> list19 = this.sdkOpen;
        if (list19 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f19 = dn.f(parcel, list19, 1);
            while (f19.hasNext()) {
                ((AccountPushParamsOnoffDto) f19.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.ads);
        parcel.writeStringList(this.live);
        parcel.writeStringList(this.login);
        parcel.writeStringList(this.validateDevice);
        parcel.writeStringList(this.validateAction);
        parcel.writeStringList(this.storyReply);
        parcel.writeStringList(this.storyAsked);
        parcel.writeStringList(this.storyAnswered);
        parcel.writeStringList(this.mask);
        parcel.writeStringList(this.call);
        parcel.writeStringList(this.missedCall);
        parcel.writeStringList(this.newUser);
        parcel.writeStringList(this.privateGroupPost);
        parcel.writeStringList(this.associatedEvents);
        parcel.writeStringList(this.bugtrackerEvents);
        parcel.writeStringList(this.newAudioAlbum);
        parcel.writeStringList(this.marketing);
        parcel.writeStringList(this.vkAppsOpenUrl);
        parcel.writeStringList(this.contentAchievements);
        parcel.writeStringList(this.podcasts);
        parcel.writeStringList(this.commentCommented);
        parcel.writeStringList(this.reminder);
        parcel.writeStringList(this.custom);
        parcel.writeStringList(this.openUrl);
        parcel.writeStringList(this.showMessage);
        parcel.writeStringList(this.erase);
        parcel.writeStringList(this.eraseMessage);
        parcel.writeStringList(this.eraseMessages);
        parcel.writeStringList(this.liveStart);
        parcel.writeStringList(this.liveNotify);
        parcel.writeStringList(this.postComment);
        parcel.writeStringList(this.suggestedPost);
        parcel.writeStringList(this.wallMention);
        parcel.writeStringList(this.commentMention);
        parcel.writeStringList(this.photoComment);
        parcel.writeStringList(this.boardPost);
        parcel.writeStringList(this.joinRequest);
        parcel.writeStringList(this.storyMention);
        parcel.writeStringList(this.wallPostCopyrightMention);
        parcel.writeStringList(this.storyQuestionAsked);
        parcel.writeStringList(this.vkPayTransaction);
        parcel.writeStringList(this.sqGame);
        parcel.writeStringList(this.sqStore);
        parcel.writeStringList(this.sqActions);
        parcel.writeStringList(this.sqGreeting);
        parcel.writeStringList(this.sqAnytimeReminder);
        parcel.writeStringList(this.sqAnytimeStartGame);
        parcel.writeStringList(this.sqAnytimeResult);
        parcel.writeStringList(this.vaPinPersonalVideo);
        parcel.writeStringList(this.vaGameScoreBeat);
        parcel.writeStringList(this.vaPushesBadge);
        parcel.writeStringList(this.vaContentReady);
        parcel.writeStringList(this.messageRequest);
        parcel.writeStringList(this.messageRequestAccepted);
        parcel.writeStringList(this.authorMention);
        List<AccountPushParamsModeDto> list20 = this.communityMsg;
        if (list20 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f20 = dn.f(parcel, list20, 1);
            while (f20.hasNext()) {
                ((AccountPushParamsModeDto) f20.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsModeDto> list21 = this.msgReactionSet;
        if (list21 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f21 = dn.f(parcel, list21, 1);
            while (f21.hasNext()) {
                ((AccountPushParamsModeDto) f21.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPushParamsModeDto> list22 = this.channels;
        if (list22 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f22 = dn.f(parcel, list22, 1);
        while (f22.hasNext()) {
            ((AccountPushParamsModeDto) f22.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPushParamsDto(List<? extends AccountPushParamsModeDto> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<? extends AccountPushParamsModeDto> list8, List<String> list9, List<? extends AccountPushParamsSettingsDto> list10, List<? extends AccountPushParamsSettingsDto> list11, List<? extends AccountPushParamsSettingsDto> list12, List<? extends AccountPushParamsSettingsDto> list13, List<? extends AccountPushParamsOnoffDto> list14, List<? extends AccountPushParamsOnoffDto> list15, List<? extends AccountPushParamsOnoffDto> list16, List<? extends AccountPushParamsOnoffDto> list17, List<String> list18, List<String> list19, List<? extends AccountPushParamsOnoffDto> list20, List<? extends AccountPushParamsOnoffDto> list21, List<String> list22, List<? extends AccountPushParamsOnoffDto> list23, List<? extends AccountPushParamsOnoffDto> list24, List<? extends AccountPushParamsOnoffDto> list25, List<String> list26, List<String> list27, List<? extends AccountPushParamsOnoffDto> list28, List<? extends AccountPushParamsOnoffDto> list29, List<? extends AccountPushParamsOnoffDto> list30, List<? extends AccountPushParamsOnoffDto> list31, List<String> list32, List<String> list33, List<String> list34, List<String> list35, List<String> list36, List<String> list37, List<String> list38, List<String> list39, List<String> list40, List<String> list41, List<String> list42, List<String> list43, List<String> list44, List<String> list45, List<String> list46, List<String> list47, List<String> list48, List<String> list49, List<String> list50, List<String> list51, List<String> list52, List<String> list53, List<String> list54, List<String> list55, List<String> list56, List<String> list57, List<String> list58, List<String> list59, List<String> list60, List<String> list61, List<String> list62, List<String> list63, List<String> list64, List<String> list65, List<String> list66, List<String> list67, List<String> list68, List<String> list69, List<String> list70, List<String> list71, List<String> list72, List<String> list73, List<String> list74, List<String> list75, List<String> list76, List<String> list77, List<String> list78, List<String> list79, List<String> list80, List<String> list81, List<String> list82, List<String> list83, List<String> list84, List<String> list85, List<String> list86, List<? extends AccountPushParamsModeDto> list87, List<? extends AccountPushParamsModeDto> list88, List<? extends AccountPushParamsModeDto> list89) {
        this.msg = list;
        this.messageNew = list2;
        this.gift = list3;
        this.money = list4;
        this.moneyTransferOld = list5;
        this.moneySend = list6;
        this.moneyRequest = list7;
        this.chat = list8;
        this.chatMention = list9;
        this.like = list10;
        this.repost = list11;
        this.comment = list12;
        this.mention = list13;
        this.reply = list14;
        this.newPost = list15;
        this.wallPost = list16;
        this.wallPublish = list17;
        this.interestPost = list18;
        this.storyLongTime = list19;
        this.friend = list20;
        this.friendFound = list21;
        this.invitedFriendFound = list22;
        this.friendAccepted = list23;
        this.groupInvite = list24;
        this.groupAccepted = list25;
        this.groupMainAdmin = list26;
        this.tagPhoto = list27;
        this.birthday = list28;
        this.eventSoon = list29;
        this.appRequest = list30;
        this.sdkOpen = list31;
        this.ads = list32;
        this.live = list33;
        this.login = list34;
        this.validateDevice = list35;
        this.validateAction = list36;
        this.storyReply = list37;
        this.storyAsked = list38;
        this.storyAnswered = list39;
        this.mask = list40;
        this.call = list41;
        this.missedCall = list42;
        this.newUser = list43;
        this.privateGroupPost = list44;
        this.associatedEvents = list45;
        this.bugtrackerEvents = list46;
        this.newAudioAlbum = list47;
        this.marketing = list48;
        this.vkAppsOpenUrl = list49;
        this.contentAchievements = list50;
        this.podcasts = list51;
        this.commentCommented = list52;
        this.reminder = list53;
        this.custom = list54;
        this.openUrl = list55;
        this.showMessage = list56;
        this.erase = list57;
        this.eraseMessage = list58;
        this.eraseMessages = list59;
        this.liveStart = list60;
        this.liveNotify = list61;
        this.postComment = list62;
        this.suggestedPost = list63;
        this.wallMention = list64;
        this.commentMention = list65;
        this.photoComment = list66;
        this.boardPost = list67;
        this.joinRequest = list68;
        this.storyMention = list69;
        this.wallPostCopyrightMention = list70;
        this.storyQuestionAsked = list71;
        this.vkPayTransaction = list72;
        this.sqGame = list73;
        this.sqStore = list74;
        this.sqActions = list75;
        this.sqGreeting = list76;
        this.sqAnytimeReminder = list77;
        this.sqAnytimeStartGame = list78;
        this.sqAnytimeResult = list79;
        this.vaPinPersonalVideo = list80;
        this.vaGameScoreBeat = list81;
        this.vaPushesBadge = list82;
        this.vaContentReady = list83;
        this.messageRequest = list84;
        this.messageRequestAccepted = list85;
        this.authorMention = list86;
        this.communityMsg = list87;
        this.msgReactionSet = list88;
        this.channels = list89;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AccountPushParamsDto(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, List list40, List list41, List list42, List list43, List list44, List list45, List list46, List list47, List list48, List list49, List list50, List list51, List list52, List list53, List list54, List list55, List list56, List list57, List list58, List list59, List list60, List list61, List list62, List list63, List list64, List list65, List list66, List list67, List list68, List list69, List list70, List list71, List list72, List list73, List list74, List list75, List list76, List list77, List list78, List list79, List list80, List list81, List list82, List list83, List list84, List list85, List list86, List list87, List list88, List list89, int i, int i2, int i3, zcl zclVar) {
        this(r73, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r74, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : list33, (i2 & 2) != 0 ? null : list34, (i2 & 4) != 0 ? null : list35, (i2 & 8) != 0 ? null : list36, (i2 & 16) != 0 ? null : list37, (i2 & 32) != 0 ? null : list38, (i2 & 64) != 0 ? null : list39, (i2 & 128) != 0 ? null : list40, (i2 & 256) != 0 ? null : list41, (i2 & 512) != 0 ? null : list42, (i2 & 1024) != 0 ? null : list43, (i2 & 2048) != 0 ? null : list44, (i2 & 4096) != 0 ? null : list45, (i2 & 8192) != 0 ? null : list46, (i2 & 16384) != 0 ? null : list47, (i2 & 32768) != 0 ? null : list48, (i2 & 65536) != 0 ? null : list49, (i2 & 131072) != 0 ? null : list50, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list51, (i2 & 524288) != 0 ? null : list52, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list53, (i2 & 2097152) != 0 ? null : list54, (i2 & 4194304) != 0 ? null : list55, (i2 & 8388608) != 0 ? null : list56, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list57, (i2 & 33554432) != 0 ? null : list58, (i2 & 67108864) != 0 ? null : list59, (i2 & 134217728) != 0 ? null : list60, (i2 & 268435456) != 0 ? null : list61, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list62, (i2 & 1073741824) != 0 ? null : list63, (i2 & Integer.MIN_VALUE) != 0 ? null : list64, (i3 & 1) != 0 ? null : list65, (i3 & 2) != 0 ? null : list66, (i3 & 4) != 0 ? null : list67, (i3 & 8) != 0 ? null : list68, (i3 & 16) != 0 ? null : list69, (i3 & 32) != 0 ? null : list70, (i3 & 64) != 0 ? null : list71, (i3 & 128) != 0 ? null : list72, (i3 & 256) != 0 ? null : list73, (i3 & 512) != 0 ? null : list74, (i3 & 1024) != 0 ? null : list75, (i3 & 2048) != 0 ? null : list76, (i3 & 4096) != 0 ? null : list77, (i3 & 8192) != 0 ? null : list78, (i3 & 16384) != 0 ? null : list79, (i3 & 32768) != 0 ? null : list80, (i3 & 65536) != 0 ? null : list81, (i3 & 131072) != 0 ? null : list82, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list83, (i3 & 524288) != 0 ? null : list84, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list85, (i3 & 2097152) != 0 ? null : list86, (i3 & 4194304) != 0 ? null : list87, (i3 & 8388608) != 0 ? null : list88, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list89);
        List list90 = (i & 1) != 0 ? null : list;
        List list91 = (i & 2) != 0 ? null : list2;
        List list92 = (i & 4) != 0 ? null : list3;
        List list93 = (i & 8) != 0 ? null : list4;
        List list94 = (i & 16) != 0 ? null : list5;
        List list95 = (i & 32) != 0 ? null : list6;
        List list96 = (i & 64) != 0 ? null : list7;
        List list97 = (i & 128) != 0 ? null : list8;
        List list98 = (i & 256) != 0 ? null : list9;
        List list99 = (i & 512) != 0 ? null : list10;
        List list100 = (i & 1024) != 0 ? null : list11;
        List list101 = (i & 2048) != 0 ? null : list12;
        List list102 = (i & 4096) != 0 ? null : list13;
        List list103 = list90;
        List list104 = (i & 8192) != 0 ? null : list14;
        List list105 = (i & 16384) != 0 ? null : list15;
        List list106 = (i & 32768) != 0 ? null : list16;
        List list107 = (i & 65536) != 0 ? null : list17;
        List list108 = (i & 131072) != 0 ? null : list18;
        List list109 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list19;
        List list110 = (i & 524288) != 0 ? null : list20;
        List list111 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list21;
        List list112 = (i & 2097152) != 0 ? null : list22;
        List list113 = (i & 4194304) != 0 ? null : list23;
        List list114 = (i & 8388608) != 0 ? null : list24;
        List list115 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list25;
        List list116 = (i & 33554432) != 0 ? null : list26;
        List list117 = (i & 67108864) != 0 ? null : list27;
        List list118 = (i & 134217728) != 0 ? null : list28;
        List list119 = (i & 268435456) != 0 ? null : list29;
        List list120 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list30;
        List list121 = (i & 1073741824) != 0 ? null : list31;
        List list122 = (i & Integer.MIN_VALUE) != 0 ? null : list32;
    }
}
