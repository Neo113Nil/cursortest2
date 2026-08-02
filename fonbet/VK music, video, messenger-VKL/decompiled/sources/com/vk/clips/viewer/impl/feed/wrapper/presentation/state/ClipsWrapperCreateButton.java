package com.vk.clips.viewer.impl.feed.wrapper.presentation.state;

import xsna.asp;
import xsna.npf;
import xsna.ppf;
import xsna.zrp;

/* compiled from: ClipsWrapperCreateButton.kt */
/* loaded from: classes17.dex */
public interface ClipsWrapperCreateButton extends ppf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsWrapperCreateButton.kt */
    public static final class CreateButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CreateButtonType[] $VALUES;
        public static final CreateButtonType NONE;
        public static final CreateButtonType PLUS;
        private final String key;

        static {
            CreateButtonType createButtonType = new CreateButtonType("NONE", 0, null);
            NONE = createButtonType;
            CreateButtonType createButtonType2 = new CreateButtonType("PLUS", 1, "plus");
            PLUS = createButtonType2;
            CreateButtonType[] createButtonTypeArr = {createButtonType, createButtonType2};
            $VALUES = createButtonTypeArr;
            $ENTRIES = new asp(createButtonTypeArr);
        }

        public CreateButtonType(String str, int i, String str2) {
            this.key = str2;
        }

        public static CreateButtonType valueOf(String str) {
            return (CreateButtonType) Enum.valueOf(CreateButtonType.class, str);
        }

        public static CreateButtonType[] values() {
            return (CreateButtonType[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsWrapperCreateButton.kt */
    public static final class a implements ClipsWrapperCreateButton {
        public final npf.h.e b;

        public a(npf.h.e eVar) {
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        @Override // com.vk.clips.viewer.impl.feed.wrapper.presentation.state.ClipsWrapperCreateButton
        public final CreateButtonType getType() {
            return CreateButtonType.PLUS;
        }

        @Override // xsna.ppf
        public final npf h() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Plus(action=" + this.b + ')';
        }
    }

    CreateButtonType getType();
}
