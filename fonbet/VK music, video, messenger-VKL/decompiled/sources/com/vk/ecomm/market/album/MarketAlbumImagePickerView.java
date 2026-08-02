package com.vk.ecomm.market.album;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.m;
import com.vkontakte.android.R;
import java.util.concurrent.ConcurrentHashMap;
import xsna.asp;
import xsna.bwt0;
import xsna.iah0;
import xsna.izs;
import xsna.ne3;
import xsna.s3q0;
import xsna.udo;
import xsna.zrp;

/* compiled from: MarketAlbumImagePickerView.kt */
/* loaded from: classes18.dex */
public final class MarketAlbumImagePickerView extends FrameLayout {
    public final TextView b;
    public final ImageView c;
    public final VKImageView d;
    public final ImageView e;
    public final TextView f;
    public final MarketAlbumImageUploadProgressView g;
    public final TextView h;
    public final TextView i;
    public final ConstraintLayout j;
    public Integer k;
    public boolean l;
    public boolean m;
    public UserId n;
    public State o;
    public izs<? super Photo, s3q0> p;
    public Photo q;
    public Photo r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketAlbumImagePickerView.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CONTENT;
        public static final State DEFAULT;
        public static final State ERROR;
        public static final State IDLE;
        public static final State LOADING;
        private final boolean cancelVisible;
        private final int contentDescription;
        private final boolean coverLabelVisible;
        private final boolean errorVisible;
        private final boolean plusViewVisible;
        private final boolean progressVisible;

        static {
            State state = new State("IDLE", 0, false, false, false, true, false, R.string.market_album_load_cover);
            IDLE = state;
            State state2 = new State("LOADING", 1, false, true, false, false, true, R.string.market_album_loading_cover_accessibility);
            LOADING = state2;
            State state3 = new State("DEFAULT", 2, false, false, true, false, true, R.string.market_album_cover_accessibility);
            DEFAULT = state3;
            State state4 = new State("CONTENT", 3, false, false, true, false, true, R.string.market_album_cover_accessibility);
            CONTENT = state4;
            State state5 = new State("ERROR", 4, true, false, true, false, false, R.string.market_album_upload_error);
            ERROR = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
            this.errorVisible = z;
            this.progressVisible = z2;
            this.cancelVisible = z3;
            this.plusViewVisible = z4;
            this.coverLabelVisible = z5;
            this.contentDescription = i2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.cancelVisible;
        }

        public final int i() {
            return this.contentDescription;
        }

        public final boolean j() {
            return this.coverLabelVisible;
        }

        public final boolean k() {
            return this.errorVisible;
        }

        public final boolean l() {
            return this.plusViewVisible;
        }

        public final boolean m() {
            return this.progressVisible;
        }
    }

    /* compiled from: MarketAlbumImagePickerView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MarketAlbumImagePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        State state = State.IDLE;
        this.o = state;
        View.inflate(context, R.layout.view_market_album_image_picker, this);
        this.b = (TextView) findViewById(R.id.cover_label_text_view);
        ImageView imageView = (ImageView) findViewById(R.id.cancel_button);
        this.c = imageView;
        imageView.setOnClickListener(new ne3(this, 6));
        VKImageView vKImageView = (VKImageView) findViewById(R.id.cover_image_view);
        this.d = vKImageView;
        vKImageView.setCornerRadius(iah0.b(8.0f));
        this.e = (ImageView) findViewById(R.id.plus_image_view);
        this.f = (TextView) findViewById(R.id.plus_text_view);
        this.g = (MarketAlbumImageUploadProgressView) findViewById(R.id.album_progress_view);
        this.h = (TextView) findViewById(R.id.album_image_error_text_view);
        this.i = (TextView) findViewById(R.id.album_image_error_reason_text_view);
        this.j = (ConstraintLayout) findViewById(R.id.container);
        c(state);
    }

    public static void a(MarketAlbumImagePickerView marketAlbumImagePickerView) {
        marketAlbumImagePickerView.setImageFile(null);
        marketAlbumImagePickerView.setDefaultPhoto(null);
        marketAlbumImagePickerView.l = true;
        Integer num = marketAlbumImagePickerView.k;
        if (num != null) {
            ConcurrentHashMap<Integer, UploadNotification.a> concurrentHashMap = com.vk.upload.impl.a.a;
            com.vk.upload.impl.a.b(num.intValue(), null);
        }
    }

    public static s3q0 b(MarketAlbumImagePickerView marketAlbumImagePickerView, UploadNotification.b bVar) {
        marketAlbumImagePickerView.g.setErrorVisible(false);
        int i = a.$EnumSwitchMapping$0[bVar.b.ordinal()];
        if (i == 1) {
            marketAlbumImagePickerView.c(State.LOADING);
            marketAlbumImagePickerView.g.a(bVar.c, bVar.d);
        } else if (i == 2) {
            marketAlbumImagePickerView.c(State.CONTENT);
            Parcelable parcelable = bVar.e;
            marketAlbumImagePickerView.setPhoto(parcelable instanceof Photo ? (Photo) parcelable : null);
        } else if (marketAlbumImagePickerView.l) {
            marketAlbumImagePickerView.c(State.IDLE);
        } else {
            marketAlbumImagePickerView.c(State.ERROR);
        }
        return s3q0.a;
    }

    private final void setImageFile(String str) {
        c(str == null ? State.IDLE : State.CONTENT);
        this.d.load(str);
        if (str != null) {
            m mVar = new m(str, this.n);
            this.k = Integer.valueOf(mVar.d);
            this.l = false;
            com.vk.upload.impl.a.h(mVar, new udo(this, 23));
        }
    }

    private final void setPhoto(Photo photo) {
        Photo photo2 = photo == null ? this.r : photo;
        this.q = photo2;
        if (photo2 == null) {
            c(State.IDLE);
        } else if (photo2.equals(this.r)) {
            c(State.DEFAULT);
        } else {
            c(State.CONTENT);
        }
        Photo photo3 = this.q;
        bwt0.L(this.d, photo3 != null ? photo3.y : null);
        izs<? super Photo, s3q0> izsVar = this.p;
        if (izsVar != null) {
            izsVar.invoke(photo);
        }
    }

    public final void c(State state) {
        this.o = state;
        bwt0.p0(this.h, state.k());
        bwt0.p0(this.i, state.k());
        bwt0.p0(this.e, state.l());
        bwt0.p0(this.f, state.l());
        bwt0.p0(this.c, !this.m && state.h());
        bwt0.p0(this.b, state.j());
        boolean m = state.m();
        MarketAlbumImageUploadProgressView marketAlbumImageUploadProgressView = this.g;
        bwt0.p0(marketAlbumImageUploadProgressView, m);
        marketAlbumImageUploadProgressView.setProgressVisible(state.m());
        this.j.setContentDescription(getContext().getString(state.i()));
    }

    public final void d(UserId userId, String str) {
        this.n = userId;
        setImageFile(str);
    }

    public final Photo getDefaultPhoto() {
        return this.r;
    }

    public final Photo getPhoto() {
        return this.q;
    }

    public final void setDefaultPhoto(Photo photo) {
        this.r = photo;
        setPhoto(photo);
    }

    public final void setHideCancelButton(boolean z) {
        this.m = z;
        c(this.o);
    }

    public final void setOnCancelClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setOnImageChangeListener(izs<? super Photo, s3q0> izsVar) {
        this.p = izsVar;
    }

    public final void setOnImageClickListener(View.OnClickListener onClickListener) {
        this.j.setOnClickListener(onClickListener);
    }
}
