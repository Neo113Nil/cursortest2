package com.vk.money.createtransfer.input;

import android.text.InputFilter;
import android.view.ViewGroup;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import xsna.asp;
import xsna.scg0;
import xsna.zrp;

/* compiled from: TransferInputField.kt */
/* loaded from: classes3.dex */
public interface TransferInputField {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransferInputField.kt */
    public static final class EditableTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EditableTarget[] $VALUES;
        public static final EditableTarget AMOUNT;
        public static final EditableTarget COMMENT;

        static {
            EditableTarget editableTarget = new EditableTarget("AMOUNT", 0);
            AMOUNT = editableTarget;
            EditableTarget editableTarget2 = new EditableTarget("COMMENT", 1);
            COMMENT = editableTarget2;
            EditableTarget[] editableTargetArr = {editableTarget, editableTarget2};
            $VALUES = editableTargetArr;
            $ENTRIES = new asp(editableTargetArr);
        }

        public EditableTarget() {
            throw null;
        }

        public static EditableTarget valueOf(String str) {
            return (EditableTarget) Enum.valueOf(EditableTarget.class, str);
        }

        public static EditableTarget[] values() {
            return (EditableTarget[]) $VALUES.clone();
        }
    }

    void clearFocus();

    ViewGroup.LayoutParams getLayoutParams();

    String getRestrictionText();

    void n1();

    void o1();

    void p1();

    void q1(EditableTarget editableTarget, int i);

    void r1(Dialog dialog, ProfilesInfo profilesInfo);

    void s1(EditableTarget editableTarget, InputFilter[] inputFilterArr);

    void setCallback(a aVar);

    void setComment(String str);

    void setRestriction(scg0 scg0Var);

    void t1(String str, boolean z);

    /* compiled from: TransferInputField.kt */
    public interface a {
        void f();

        default void e() {
        }

        default void a(String str) {
        }

        default void b(String str) {
        }
    }
}
