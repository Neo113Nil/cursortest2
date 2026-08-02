package com.vk.poll.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.ad10;
import xsna.asp;
import xsna.bd10;
import xsna.bwt0;
import xsna.gzs;
import xsna.iah0;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: PollFilterBottomView.kt */
/* loaded from: classes17.dex */
public final class PollFilterBottomView extends LinearLayout {
    public static final int g = iah0.a(56);
    public static final int h = iah0.a(62);
    public final View b;
    public final View c;
    public final AppCompatImageView d;
    public final View e;
    public final TextView f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollFilterBottomView.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FAIL;
        public static final Status PROGRESS;
        public static final Status SUCCESS;

        static {
            Status status = new Status("PROGRESS", 0);
            PROGRESS = status;
            Status status2 = new Status("FAIL", 1);
            FAIL = status2;
            Status status3 = new Status("SUCCESS", 2);
            SUCCESS = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: PollFilterBottomView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PollFilterBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.poll_filter_bottom_view, this);
        this.b = findViewById(R.id.cancelBtn);
        this.c = findViewById(R.id.replayBtn);
        this.d = (AppCompatImageView) findViewById(R.id.statusImageView);
        this.e = findViewById(R.id.progress);
        this.f = (TextView) findViewById(R.id.paramsDescription);
    }

    public final void setCancelClickListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.b, new ad10(1, gzsVar));
    }

    public final void setReplayClickListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.c, new bd10(1, gzsVar));
    }
}
