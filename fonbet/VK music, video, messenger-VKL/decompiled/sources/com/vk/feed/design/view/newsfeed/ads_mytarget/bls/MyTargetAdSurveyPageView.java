package com.vk.feed.design.view.newsfeed.ads_mytarget.bls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyButtonsView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyCellView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyPageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.awt0;
import xsna.bwt0;
import xsna.cn70;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.izs;
import xsna.j5g;
import xsna.kdn;
import xsna.q130;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.urd0;
import xsna.uv20;
import xsna.vu5;
import xsna.wzs;
import xsna.zrp;

/* compiled from: MyTargetAdSurveyPageView.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdSurveyPageView extends FrameLayout {
    public static final /* synthetic */ int l = 0;
    public final VkText b;
    public final VkText c;
    public final VkImage d;
    public final LinearLayout e;
    public final MyTargetAdSurveyButtonsView f;
    public wzs<? super String, ? super Boolean, s3q0> g;
    public izs<? super View, s3q0> h;
    public izs<? super View, s3q0> i;
    public izs<? super View, s3q0> j;
    public izs<? super View, s3q0> k;

    /* compiled from: MyTargetAdSurveyPageView.kt */
    public static final class Page {
        public final String a;
        public final QuestionType b;
        public final String c;
        public final List<Image> d;
        public final List<Answer> e;
        public final int f;
        public final int g;
        public final boolean h;
        public final int i;

        /* compiled from: MyTargetAdSurveyPageView.kt */
        public static final class Answer {
            public final String a;
            public final List<Image> b;
            public final String c;
            public final boolean d;
            public final Type e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: MyTargetAdSurveyPageView.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type NOTHING;
                public static final Type OTHER;
                public static final Type USER;

                static {
                    Type type = new Type("USER", 0);
                    USER = type;
                    Type type2 = new Type(NativeAdContent.ViewTag.OTHER, 1);
                    OTHER = type2;
                    Type type3 = new Type("NOTHING", 2);
                    NOTHING = type3;
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

            public Answer(String str, List<Image> list, String str2, boolean z, Type type) {
                this.a = str;
                this.b = list;
                this.c = str2;
                this.d = z;
                this.e = type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) obj;
                return epx.f(this.a, answer.a) && epx.f(this.b, answer.b) && epx.f(this.c, answer.c) && this.d == answer.d && this.e == answer.e;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                List<Image> list = this.b;
                return this.e.hashCode() + qoy.b(urd0.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                return "Answer(id=" + this.a + ", logo=" + this.b + ", text=" + this.c + ", isChecked=" + this.d + ", type=" + this.e + ')';
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyTargetAdSurveyPageView.kt */
        public static final class QuestionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ QuestionType[] $VALUES;
            public static final QuestionType MULTIPLE;
            public static final QuestionType SINGLE;

            static {
                QuestionType questionType = new QuestionType("SINGLE", 0);
                SINGLE = questionType;
                QuestionType questionType2 = new QuestionType("MULTIPLE", 1);
                MULTIPLE = questionType2;
                QuestionType[] questionTypeArr = {questionType, questionType2};
                $VALUES = questionTypeArr;
                $ENTRIES = new asp(questionTypeArr);
            }

            public QuestionType() {
                throw null;
            }

            public static QuestionType valueOf(String str) {
                return (QuestionType) Enum.valueOf(QuestionType.class, str);
            }

            public static QuestionType[] values() {
                return (QuestionType[]) $VALUES.clone();
            }
        }

        public Page(String str, QuestionType questionType, String str2, List<Image> list, List<Answer> list2, int i, int i2, boolean z, int i3) {
            this.a = str;
            this.b = questionType;
            this.c = str2;
            this.d = list;
            this.e = list2;
            this.f = i;
            this.g = i2;
            this.h = z;
            this.i = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Page)) {
                return false;
            }
            Page page = (Page) obj;
            return epx.f(this.a, page.a) && this.b == page.b && epx.f(this.c, page.c) && epx.f(this.d, page.d) && epx.f(this.e, page.e) && this.f == page.f && this.g == page.g && this.h == page.h && this.i == page.i;
        }

        public final int hashCode() {
            int a = urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            List<Image> list = this.d;
            return Integer.hashCode(this.i) + qoy.b(shy.a(this.g, shy.a(this.f, fw3.a((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31), 31), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Page(questionId=");
            sb.append(this.a);
            sb.append(", questionType=");
            sb.append(this.b);
            sb.append(", questionText=");
            sb.append(this.c);
            sb.append(", images=");
            sb.append(this.d);
            sb.append(", answers=");
            sb.append(this.e);
            sb.append(", pageIndex=");
            sb.append(this.f);
            sb.append(", pagesTotal=");
            sb.append(this.g);
            sb.append(", isExpandable=");
            sb.append(this.h);
            sb.append(", totalAnswers=");
            return vu5.b(sb, this.i, ')');
        }
    }

    /* compiled from: MyTargetAdSurveyPageView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Page.QuestionType.values().length];
            try {
                iArr[Page.QuestionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Page.QuestionType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MyTargetAdSurveyPageView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final void setUpAnswers(final Page page) {
        int i;
        MyTargetAdSurveyCellView.Type type;
        final List<Page.Answer> list = page.e;
        int size = list.size();
        LinearLayout linearLayout = this.e;
        int childCount = linearLayout.getChildCount();
        if (childCount < size) {
            while (childCount < size) {
                View myTargetAdSurveyCellView = new MyTargetAdSurveyCellView(getContext(), null, 0, 14, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = childCount == 0 ? cn70.b(0) : cn70.b(8);
                myTargetAdSurveyCellView.setLayoutParams(layoutParams);
                linearLayout.addView(myTargetAdSurveyCellView, linearLayout.indexOfChild(this.f));
                childCount++;
            }
        } else if (childCount > size && size <= (i = childCount - 1)) {
            while (true) {
                linearLayout.removeViewAt(i);
                if (i == size) {
                    break;
                } else {
                    i--;
                }
            }
        }
        int i2 = a.$EnumSwitchMapping$0[page.b.ordinal()];
        if (i2 == 1) {
            type = MyTargetAdSurveyCellView.Type.Radio;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type = MyTargetAdSurveyCellView.Type.Square;
        }
        MyTargetAdSurveyCellView.Type type2 = type;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            final Page.Answer answer = (Page.Answer) obj;
            View childAt = linearLayout.getChildAt(i3);
            MyTargetAdSurveyCellView myTargetAdSurveyCellView2 = childAt instanceof MyTargetAdSurveyCellView ? (MyTargetAdSurveyCellView) childAt : null;
            if (myTargetAdSurveyCellView2 != null) {
                myTargetAdSurveyCellView2.setIcon(answer.b);
                myTargetAdSurveyCellView2.setTitle(answer.c);
                myTargetAdSurveyCellView2.setOnCheckedChangedListener(null);
                myTargetAdSurveyCellView2.setChecked(answer.d && !page.h);
                myTargetAdSurveyCellView2.setType(type2);
                final MyTargetAdSurveyCellView myTargetAdSurveyCellView3 = myTargetAdSurveyCellView2;
                myTargetAdSurveyCellView3.setOnCheckedChangedListener(new izs() { // from class: xsna.ip50
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        MyTargetAdSurveyPageView myTargetAdSurveyPageView = this;
                        LinearLayout linearLayout2 = myTargetAdSurveyPageView.e;
                        MyTargetAdSurveyPageView.Page.Answer answer2 = answer;
                        MyTargetAdSurveyPageView.Page.Answer.Type type3 = answer2.e;
                        String str = answer2.a;
                        Boolean bool = (Boolean) obj2;
                        boolean booleanValue = bool.booleanValue();
                        int i5 = MyTargetAdSurveyPageView.l;
                        if (MyTargetAdSurveyPageView.Page.this.h) {
                            izs<? super View, s3q0> izsVar = myTargetAdSurveyPageView.k;
                            if (izsVar != null) {
                                izsVar.invoke(myTargetAdSurveyCellView3);
                            }
                            return s3q0.a;
                        }
                        wzs<? super String, ? super Boolean, s3q0> wzsVar = myTargetAdSurveyPageView.g;
                        if (wzsVar != null) {
                            wzsVar.invoke(str, bool);
                        }
                        MyTargetAdSurveyPageView.Page.Answer.Type type4 = MyTargetAdSurveyPageView.Page.Answer.Type.NOTHING;
                        List list2 = list;
                        MyTargetAdSurveyCellView myTargetAdSurveyCellView4 = null;
                        boolean z = false;
                        if (type3 == type4 && booleanValue) {
                            int i6 = 0;
                            for (Object obj3 : list2) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (!((MyTargetAdSurveyPageView.Page.Answer) obj3).a.equals(str)) {
                                    View childAt2 = linearLayout2.getChildAt(i6);
                                    MyTargetAdSurveyCellView myTargetAdSurveyCellView5 = childAt2 instanceof MyTargetAdSurveyCellView ? (MyTargetAdSurveyCellView) childAt2 : null;
                                    if (myTargetAdSurveyCellView5 != null) {
                                        myTargetAdSurveyCellView5.setChecked(false);
                                    }
                                }
                                i6 = i7;
                            }
                        }
                        Iterator it = list2.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i8 = -1;
                                break;
                            }
                            Object next = it.next();
                            if (i8 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (((MyTargetAdSurveyPageView.Page.Answer) next).e == MyTargetAdSurveyPageView.Page.Answer.Type.NOTHING) {
                                break;
                            }
                            i8++;
                        }
                        Integer valueOf = i8 == -1 ? null : Integer.valueOf(i8);
                        if (valueOf != null) {
                            View childAt3 = linearLayout2.getChildAt(valueOf.intValue());
                            if (childAt3 instanceof MyTargetAdSurveyCellView) {
                                myTargetAdSurveyCellView4 = (MyTargetAdSurveyCellView) childAt3;
                            }
                        }
                        if (myTargetAdSurveyCellView4 != null && myTargetAdSurveyCellView4.d.isChecked() && booleanValue && type3 != MyTargetAdSurveyPageView.Page.Answer.Type.NOTHING) {
                            myTargetAdSurveyCellView4.setChecked(false);
                        }
                        MyTargetAdSurveyButtonsView myTargetAdSurveyButtonsView = myTargetAdSurveyPageView.f;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= linearLayout2.getChildCount()) {
                                break;
                            }
                            View childAt4 = linearLayout2.getChildAt(i9);
                            if ((childAt4 instanceof MyTargetAdSurveyCellView) && ((MyTargetAdSurveyCellView) childAt4).d.isChecked()) {
                                z = true;
                                break;
                            }
                            i9++;
                        }
                        myTargetAdSurveyButtonsView.setNextButtonEnabled(z);
                        myTargetAdSurveyButtonsView.setFinishButtonEnabled(z);
                        return s3q0.a;
                    }
                });
                myTargetAdSurveyCellView3.setOnClickListener(new View.OnClickListener() { // from class: xsna.jp50
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = MyTargetAdSurveyPageView.l;
                        if (!MyTargetAdSurveyPageView.Page.this.h) {
                            myTargetAdSurveyCellView3.d.toggle();
                            return;
                        }
                        izs<? super View, s3q0> izsVar = this.k;
                        if (izsVar != null) {
                            izsVar.invoke(view);
                        }
                    }
                });
            }
            i3 = i4;
        }
    }

    private final void setUpButtons(Page page) {
        boolean z = page.h;
        MyTargetAdSurveyButtonsView myTargetAdSurveyButtonsView = this.f;
        if (z) {
            myTargetAdSurveyButtonsView.setVisibility(8);
            return;
        }
        boolean z2 = true;
        awt0.v(myTargetAdSurveyButtonsView, true);
        int i = page.f;
        boolean z3 = i >= page.g - 1;
        boolean z4 = i != 0;
        VkButton vkButton = myTargetAdSurveyButtonsView.b;
        awt0.v(vkButton, z4);
        vkButton.setText(R.string.bls_button_back);
        VkButton vkButton2 = myTargetAdSurveyButtonsView.c;
        awt0.v(vkButton2, !z3);
        vkButton2.setText(R.string.bls_button_next);
        VkButton vkButton3 = myTargetAdSurveyButtonsView.d;
        awt0.v(vkButton3, z3);
        vkButton3.setText(R.string.bls_button_finish);
        myTargetAdSurveyButtonsView.a(new q130(this, 7), new kdn(this, 29), new uv20(this, 10));
        int i2 = 0;
        while (true) {
            LinearLayout linearLayout = this.e;
            if (i2 >= linearLayout.getChildCount()) {
                z2 = false;
                break;
            }
            View childAt = linearLayout.getChildAt(i2);
            if ((childAt instanceof MyTargetAdSurveyCellView) && ((MyTargetAdSurveyCellView) childAt).d.isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        myTargetAdSurveyButtonsView.setNextButtonEnabled(z2);
        myTargetAdSurveyButtonsView.setFinishButtonEnabled(z2);
    }

    private final void setUpImage(Page page) {
        ArrayList arrayList;
        ImageSize imageSize;
        boolean z = !page.d.isEmpty();
        VkImage vkImage = this.d;
        awt0.v(vkImage, z);
        Image image = (Image) j5g.a0(page.d);
        if (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) {
            return;
        }
        com.vk.dto.common.im.Image image2 = imageSize.d;
        float f = image2.b;
        float f2 = image2.c;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            vkImage.setAspectRatio(f / f2);
        }
        vkImage.o0(image2.d, null);
    }

    private final void setUpTexts(Page page) {
        this.b.setText(page.c);
        int i = page.g;
        this.c.setText(i > 1 ? getContext().getString(R.string.bls_subtitle_many, Integer.valueOf(page.f + 1), Integer.valueOf(i)) : getContext().getString(R.string.bls_subtitle_one));
    }

    public final void setCheckboxesEnabled(boolean z) {
        LinearLayout linearLayout = this.e;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (!(childAt instanceof MyTargetAdSurveyCellView)) {
                return;
            }
            ((MyTargetAdSurveyCellView) childAt).setCheckboxClickable(z);
        }
    }

    public final void setOnCheckedChangeListener(wzs<? super String, ? super Boolean, s3q0> wzsVar) {
        this.g = wzsVar;
    }

    public final void setUp(Page page) {
        setUpTexts(page);
        setUpImage(page);
        setUpAnswers(page);
        setUpButtons(page);
    }

    public MyTargetAdSurveyPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MyTargetAdSurveyPageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MyTargetAdSurveyPageView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MyTargetAdSurveyPageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.my_target_ad_survey_page_view, (ViewGroup) this, true);
        this.b = (VkText) findViewById(R.id.tv_question);
        this.c = (VkText) findViewById(R.id.tv_question_subhead);
        VkImage vkImage = (VkImage) findViewById(R.id.question_image);
        this.d = vkImage;
        this.e = (LinearLayout) findViewById(R.id.answers_container);
        this.f = (MyTargetAdSurveyButtonsView) findViewById(R.id.buttons_container);
        bwt0.d(vkImage, cn70.c(8), (r4 & 2) != 0, (r4 & 4) != 0);
    }
}
