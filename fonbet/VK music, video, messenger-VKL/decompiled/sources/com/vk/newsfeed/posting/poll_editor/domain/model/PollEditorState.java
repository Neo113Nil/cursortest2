package com.vk.newsfeed.posting.poll_editor.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.qoy;

/* compiled from: PollEditorState.kt */
/* loaded from: classes4.dex */
public interface PollEditorState extends km50, Parcelable {

    /* compiled from: PollEditorState.kt */
    public static final class Editing implements PollEditorState, Parcelable {
        public static final Parcelable.Creator<Editing> CREATOR = new a();
        public final UserId b;
        public final PollEditorUiConfig c;
        public final PickerTechMetrics d;
        public final PostingPollDto e;
        public final PostingPollDto f;
        public final PostingPollDto g;
        public final boolean h;
        public final PollEditorMode i;
        public final List<PollEditorScreen> j;
        public final boolean k;
        public final boolean l;

        /* compiled from: PollEditorState.kt */
        public static final class a implements Parcelable.Creator<Editing> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Editing createFromParcel(Parcel parcel) {
                int i;
                UserId userId = (UserId) parcel.readParcelable(Editing.class.getClassLoader());
                PollEditorUiConfig createFromParcel = PollEditorUiConfig.CREATOR.createFromParcel(parcel);
                PickerTechMetrics createFromParcel2 = PickerTechMetrics.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<PostingPollDto> creator = PostingPollDto.CREATOR;
                PostingPollDto createFromParcel3 = creator.createFromParcel(parcel);
                PostingPollDto createFromParcel4 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PostingPollDto createFromParcel5 = creator.createFromParcel(parcel);
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                PollEditorMode pollEditorMode = (PollEditorMode) parcel.readParcelable(Editing.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(Editing.class, parcel, arrayList, i2, i);
                }
                return new Editing(userId, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, z, pollEditorMode, arrayList, parcel.readInt() != 0 ? i : 0, parcel.readInt() != 0 ? i : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Editing[] newArray(int i) {
                return new Editing[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Editing(UserId userId, PollEditorUiConfig pollEditorUiConfig, PickerTechMetrics pickerTechMetrics, PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PostingPollDto postingPollDto3, boolean z, PollEditorMode pollEditorMode, List<? extends PollEditorScreen> list, boolean z2, boolean z3) {
            this.b = userId;
            this.c = pollEditorUiConfig;
            this.d = pickerTechMetrics;
            this.e = postingPollDto;
            this.f = postingPollDto2;
            this.g = postingPollDto3;
            this.h = z;
            this.i = pollEditorMode;
            this.j = list;
            this.k = z2;
            this.l = z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Editing a(Editing editing, PickerTechMetrics pickerTechMetrics, PostingPollDto postingPollDto, PostingPollDto postingPollDto2, boolean z, ArrayList arrayList, boolean z2, int i) {
            UserId userId = editing.b;
            PollEditorUiConfig pollEditorUiConfig = editing.c;
            if ((i & 4) != 0) {
                pickerTechMetrics = editing.d;
            }
            PickerTechMetrics pickerTechMetrics2 = pickerTechMetrics;
            if ((i & 8) != 0) {
                postingPollDto = editing.e;
            }
            PostingPollDto postingPollDto3 = postingPollDto;
            PostingPollDto postingPollDto4 = editing.f;
            PostingPollDto postingPollDto5 = (i & 32) != 0 ? editing.g : postingPollDto2;
            boolean z3 = (i & 64) != 0 ? editing.h : z;
            PollEditorMode pollEditorMode = editing.i;
            List list = (i & 256) != 0 ? editing.j : arrayList;
            boolean z4 = (i & 512) != 0 ? editing.k : z2;
            boolean z5 = (i & 1024) != 0 ? editing.l : false;
            editing.getClass();
            return new Editing(userId, pollEditorUiConfig, pickerTechMetrics2, postingPollDto3, postingPollDto4, postingPollDto5, z3, pollEditorMode, list, z4, z5);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Editing)) {
                return false;
            }
            Editing editing = (Editing) obj;
            return epx.f(this.b, editing.b) && epx.f(this.c, editing.c) && epx.f(this.d, editing.d) && epx.f(this.e, editing.e) && epx.f(this.f, editing.f) && epx.f(this.g, editing.g) && this.h == editing.h && epx.f(this.i, editing.i) && epx.f(this.j, editing.j) && this.k == editing.k && this.l == editing.l;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31)) * 31)) * 31;
            PostingPollDto postingPollDto = this.f;
            return Boolean.hashCode(this.l) + qoy.b(fw3.a((this.i.hashCode() + qoy.b((this.g.hashCode() + ((hashCode + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31)) * 31, 31, this.h)) * 31, 31, this.j), 31, this.k);
        }

        @Override // com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState
        public final UserId q() {
            return this.b;
        }

        @Override // com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState
        public final PickerTechMetrics q1() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Editing(ownerId=");
            sb.append(this.b);
            sb.append(", config=");
            sb.append(this.c);
            sb.append(", techMetrics=");
            sb.append(this.d);
            sb.append(", poll=");
            sb.append(this.e);
            sb.append(", lastSavedPoll=");
            sb.append(this.f);
            sb.append(", currentState=");
            sb.append(this.g);
            sb.append(", hasRemovedAnswers=");
            sb.append(this.h);
            sb.append(", mode=");
            sb.append(this.i);
            sb.append(", backStack=");
            sb.append(this.j);
            sb.append(", shouldShowSpinner=");
            sb.append(this.k);
            sb.append(", shouldShowExitDialog=");
            return q0.a(sb, this.l, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            this.c.writeToParcel(parcel, i);
            this.d.writeToParcel(parcel, i);
            this.e.writeToParcel(parcel, i);
            PostingPollDto postingPollDto = this.f;
            if (postingPollDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                postingPollDto.writeToParcel(parcel, i);
            }
            this.g.writeToParcel(parcel, i);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeParcelable(this.i, i);
            Iterator a2 = ao.a(parcel, this.j);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
        }
    }

    /* compiled from: PollEditorState.kt */
    public static final class Loading implements PollEditorState {
        public static final Parcelable.Creator<Loading> CREATOR = new a();
        public final UserId b;
        public final PollEditorUiConfig c;
        public final PickerTechMetrics d;

        /* compiled from: PollEditorState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                return new Loading((UserId) parcel.readParcelable(Loading.class.getClassLoader()), PollEditorUiConfig.CREATOR.createFromParcel(parcel), PickerTechMetrics.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(UserId userId, PollEditorUiConfig pollEditorUiConfig, PickerTechMetrics pickerTechMetrics) {
            this.b = userId;
            this.c = pollEditorUiConfig;
            this.d = pickerTechMetrics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return epx.f(this.b, loading.b) && epx.f(this.c, loading.c) && epx.f(this.d, loading.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31);
        }

        @Override // com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState
        public final UserId q() {
            return this.b;
        }

        @Override // com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState
        public final PickerTechMetrics q1() {
            return this.d;
        }

        public final String toString() {
            return "Loading(ownerId=" + this.b + ", config=" + this.c + ", techMetrics=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            this.c.writeToParcel(parcel, i);
            this.d.writeToParcel(parcel, i);
        }
    }

    UserId q();

    PickerTechMetrics q1();
}
