package io.ably.lib.types;

/* loaded from: classes9.dex */
public enum MessageAction {
    MESSAGE_CREATE,
    MESSAGE_UPDATE,
    MESSAGE_DELETE,
    META,
    MESSAGE_SUMMARY;

    static MessageAction tryFindByOrdinal(int i) {
        if (values().length <= i) {
            return null;
        }
        return values()[i];
    }
}
