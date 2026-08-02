package com.vk.dto.user;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.zrp;

/* compiled from: ProfileActionButton.kt */
/* loaded from: classes18.dex */
public final class ProfileActionButton implements Serializer.StreamParcelable {
    public static final Serializer.c<ProfileActionButton> CREATOR = new a();
    public final Type b;
    public final Icon c;
    public final Action d;

    /* compiled from: ProfileActionButton.kt */
    public static final class Action implements Serializer.StreamParcelable {
        public static final Serializer.c<Action> CREATOR = new a();
        public final ActionType b;
        public final UserId c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Action> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Action a(Serializer serializer) {
                return new Action((ActionType) serializer.C(), (UserId) serializer.A(UserId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(ActionType actionType, UserId userId) {
            this.b = actionType;
            this.c = userId;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.g0(this.b);
            serializer.e0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileActionButton.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType ADD_FRIEND;
        public static final ActionType DELETE_FRIEND;

        static {
            ActionType actionType = new ActionType("ADD_FRIEND", 0);
            ADD_FRIEND = actionType;
            ActionType actionType2 = new ActionType("DELETE_FRIEND", 1);
            DELETE_FRIEND = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileActionButton.kt */
    public static final class Icon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final Icon ADD;
        public static final Icon DONE;

        static {
            Icon icon = new Icon("ADD", 0);
            ADD = icon;
            Icon icon2 = new Icon("DONE", 1);
            DONE = icon2;
            Icon[] iconArr = {icon, icon2};
            $VALUES = iconArr;
            $ENTRIES = new asp(iconArr);
        }

        public Icon() {
            throw null;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileActionButton.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACCEPT;
        public static final Type ADD;
        public static final Type SUBSCRIBE_USER;

        static {
            Type type = new Type("ADD", 0);
            ADD = type;
            Type type2 = new Type("ACCEPT", 1);
            ACCEPT = type2;
            Type type3 = new Type("SUBSCRIBE_USER", 2);
            SUBSCRIBE_USER = type3;
            Type[] typeArr = {type, type2, type3};
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProfileActionButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfileActionButton a(Serializer serializer) {
            return new ProfileActionButton((Type) serializer.C(), (Icon) serializer.C(), (Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfileActionButton[i];
        }
    }

    public ProfileActionButton(Type type, Icon icon, Action action) {
        this.b = type;
        this.c = icon;
        this.d = action;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.g0(this.c);
        serializer.i0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
