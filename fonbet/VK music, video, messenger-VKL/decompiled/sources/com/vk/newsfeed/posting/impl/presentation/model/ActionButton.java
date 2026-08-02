package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class ActionButton implements Parcelable {
    public static final Parcelable.Creator<ActionButton> CREATOR = new a();
    public final WallAttachmentsActionButtonDto b;
    public final WallActionButtonVkTicketDto c;
    public final String d;
    public final String e;
    public final Type f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingViewState.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Action;
        public static final Type DonutGoal;
        public static final Type DonutLevel;
        public static final Type VkTicket;

        static {
            Type type = new Type("Action", 0);
            Action = type;
            Type type2 = new Type("DonutLevel", 1);
            DonutLevel = type2;
            Type type3 = new Type("DonutGoal", 2);
            DonutGoal = type3;
            Type type4 = new Type("VkTicket", 3);
            VkTicket = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<ActionButton> {
        @Override // android.os.Parcelable.Creator
        public final ActionButton createFromParcel(Parcel parcel) {
            return new ActionButton((WallAttachmentsActionButtonDto) parcel.readParcelable(ActionButton.class.getClassLoader()), (WallActionButtonVkTicketDto) parcel.readParcelable(ActionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionButton[] newArray(int i) {
            return new ActionButton[i];
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WallActionButtonTypeDto.values().length];
            try {
                iArr[WallActionButtonTypeDto.MESSAGE_TO_COMMUNITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallActionButtonTypeDto.MESSAGE_TO_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WallActionButtonTypeDto.BUY_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WallActionButtonTypeDto.OPEN_MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WallActionButtonTypeDto.ONLINE_BOOKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WallActionButtonTypeDto.DONUT_GOAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WallActionButtonTypeDto.DONUT_LEVELS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WallActionButtonTypeDto.DONUT_LEVEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WallActionButtonTypeDto.DONUT_SUPPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WallActionButtonTypeDto.VK_TICKET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ActionButton(WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto, WallActionButtonVkTicketDto wallActionButtonVkTicketDto) {
        Type type;
        this.b = wallAttachmentsActionButtonDto;
        this.c = wallActionButtonVkTicketDto;
        this.d = wallAttachmentsActionButtonDto.getTitle();
        this.e = wallAttachmentsActionButtonDto.getDescription();
        switch (b.$EnumSwitchMapping$0[wallAttachmentsActionButtonDto.f().ordinal()]) {
            case 1:
                type = Type.Action;
                break;
            case 2:
                type = Type.Action;
                break;
            case 3:
                type = Type.Action;
                break;
            case 4:
                type = Type.Action;
                break;
            case 5:
                type = Type.Action;
                break;
            case 6:
                type = Type.DonutGoal;
                break;
            case 7:
                type = Type.DonutLevel;
                break;
            case 8:
                type = Type.DonutLevel;
                break;
            case 9:
                type = Type.DonutLevel;
                break;
            case 10:
                type = Type.VkTicket;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = this.b;
        ActionButton actionButton = (ActionButton) obj;
        if (wallAttachmentsActionButtonDto.f() == actionButton.b.f()) {
            WallActionButtonGoalDto d = wallAttachmentsActionButtonDto.d();
            Integer valueOf = d != null ? Integer.valueOf(d.d()) : null;
            WallActionButtonGoalDto d2 = actionButton.b.d();
            if (epx.f(valueOf, d2 != null ? Integer.valueOf(d2.d()) : null)) {
                WallActionButtonLevelDto e = wallAttachmentsActionButtonDto.e();
                Integer valueOf2 = e != null ? Integer.valueOf(e.d()) : null;
                WallActionButtonLevelDto e2 = actionButton.b.e();
                if (epx.f(valueOf2, e2 != null ? Integer.valueOf(e2.d()) : null) && epx.f(this.c, actionButton.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = this.b;
        int hashCode = wallAttachmentsActionButtonDto.f().hashCode() * 31;
        WallActionButtonGoalDto d = wallAttachmentsActionButtonDto.d();
        Integer valueOf = d != null ? Integer.valueOf(d.d()) : null;
        int hashCode2 = (hashCode + (valueOf != null ? valueOf.hashCode() : 0)) * 31;
        WallActionButtonLevelDto e = wallAttachmentsActionButtonDto.e();
        Integer valueOf2 = e != null ? Integer.valueOf(e.d()) : null;
        int hashCode3 = (hashCode2 + (valueOf2 != null ? valueOf2.hashCode() : 0)) * 31;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = this.c;
        return hashCode3 + (wallActionButtonVkTicketDto != null ? wallActionButtonVkTicketDto.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButton(attachment=" + this.b + ", vkTicketData=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ ActionButton(WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto, WallActionButtonVkTicketDto wallActionButtonVkTicketDto, int i, zcl zclVar) {
        this(wallAttachmentsActionButtonDto, (i & 2) != 0 ? null : wallActionButtonVkTicketDto);
    }
}
