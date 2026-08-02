package expo.modules.contacts.next.records;

import com.facebook.GraphRequest;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import expo.modules.kotlin.records.formatters.FormattedRecord;
import expo.modules.kotlin.records.formatters.Formatter;
import expo.modules.kotlin.records.formatters.FormatterKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* compiled from: SkipFormatter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\tR\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/contacts/next/records/SkipFormatter;", "", GraphRequest.FIELDS_PARAM, "", "Lexpo/modules/contacts/next/records/fields/ContactField;", "<init>", "(Ljava/util/Set;)V", "formatter", "Lexpo/modules/kotlin/records/formatters/Formatter;", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "format", "Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "getContactDetailsRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SkipFormatter {
    private final Set<ContactField> fields;
    private final Formatter<GetContactDetailsRecord> formatter = FormatterKt.formatter(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit formatter$lambda$24;
            formatter$lambda$24 = SkipFormatter.formatter$lambda$24(SkipFormatter.this, (Formatter.Builder) obj);
            return formatter$lambda$24;
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public SkipFormatter(Set<? extends ContactField> set) {
        this.fields = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit formatter$lambda$24(final SkipFormatter skipFormatter, Formatter.Builder formatter) {
        Intrinsics.checkNotNullParameter(formatter, "$this$formatter");
        if (skipFormatter.fields == null) {
            return Unit.INSTANCE;
        }
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getFullName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$0;
                formatter$lambda$24$lambda$0 = SkipFormatter.formatter$lambda$24$lambda$0(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$0);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getGivenName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$1;
                formatter$lambda$24$lambda$1 = SkipFormatter.formatter$lambda$24$lambda$1(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$1);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$5
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getMiddleName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$2;
                formatter$lambda$24$lambda$2 = SkipFormatter.formatter$lambda$24$lambda$2(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$2);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$7
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getFamilyName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$3;
                formatter$lambda$24$lambda$3 = SkipFormatter.formatter$lambda$24$lambda$3(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$3);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$9
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPrefix();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$4;
                formatter$lambda$24$lambda$4 = SkipFormatter.formatter$lambda$24$lambda$4(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$4);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$11
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getSuffix();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$5;
                formatter$lambda$24$lambda$5 = SkipFormatter.formatter$lambda$24$lambda$5(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$5);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$13
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticGivenName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$6;
                formatter$lambda$24$lambda$6 = SkipFormatter.formatter$lambda$24$lambda$6(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$6);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$15
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticMiddleName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$7;
                formatter$lambda$24$lambda$7 = SkipFormatter.formatter$lambda$24$lambda$7(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$7);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$17
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticFamilyName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$8;
                formatter$lambda$24$lambda$8 = SkipFormatter.formatter$lambda$24$lambda$8(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$8);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$19
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getCompany();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$9;
                formatter$lambda$24$lambda$9 = SkipFormatter.formatter$lambda$24$lambda$9(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$9);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$21
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getDepartment();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$10;
                formatter$lambda$24$lambda$10 = SkipFormatter.formatter$lambda$24$lambda$10(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$10);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$23
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getJobTitle();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$11;
                formatter$lambda$24$lambda$11 = SkipFormatter.formatter$lambda$24$lambda$11(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$11);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$25
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhoneticCompanyName();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$12;
                formatter$lambda$24$lambda$12 = SkipFormatter.formatter$lambda$24$lambda$12(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$12);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$27
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getImage();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$13;
                formatter$lambda$24$lambda$13 = SkipFormatter.formatter$lambda$24$lambda$13(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$13);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$29
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getThumbnail();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$14;
                formatter$lambda$24$lambda$14 = SkipFormatter.formatter$lambda$24$lambda$14(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$14);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$31
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getNote();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$15;
                formatter$lambda$24$lambda$15 = SkipFormatter.formatter$lambda$24$lambda$15(SkipFormatter.this, (String) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$15);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$33
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getIsFavourite();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$16;
                formatter$lambda$24$lambda$16 = SkipFormatter.formatter$lambda$24$lambda$16(SkipFormatter.this, (Boolean) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$16);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$35
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getEmails();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$17;
                formatter$lambda$24$lambda$17 = SkipFormatter.formatter$lambda$24$lambda$17(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$17);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$37
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getPhones();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$18;
                formatter$lambda$24$lambda$18 = SkipFormatter.formatter$lambda$24$lambda$18(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$18);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$39
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getAddresses();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$19;
                formatter$lambda$24$lambda$19 = SkipFormatter.formatter$lambda$24$lambda$19(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$19);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$41
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getDates();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$20;
                formatter$lambda$24$lambda$20 = SkipFormatter.formatter$lambda$24$lambda$20(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$20);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$43
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getRelations();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$21;
                formatter$lambda$24$lambda$21 = SkipFormatter.formatter$lambda$24$lambda$21(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$21);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$45
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getUrlAddresses();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$22;
                formatter$lambda$24$lambda$22 = SkipFormatter.formatter$lambda$24$lambda$22(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$22);
            }
        });
        formatter.property((KProperty1) new PropertyReference1Impl() { // from class: expo.modules.contacts.next.records.SkipFormatter$formatter$1$47
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((GetContactDetailsRecord) obj).getExtraNames();
            }
        }).skip(new Function1() { // from class: expo.modules.contacts.next.records.SkipFormatter$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean formatter$lambda$24$lambda$23;
                formatter$lambda$24$lambda$23 = SkipFormatter.formatter$lambda$24$lambda$23(SkipFormatter.this, (List) obj);
                return Boolean.valueOf(formatter$lambda$24$lambda$23);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$0(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.FULL_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$1(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.GIVEN_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$2(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.MIDDLE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$3(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.FAMILY_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$4(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PREFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$5(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.SUFFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$6(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_GIVEN_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$7(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_MIDDLE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$8(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_FAMILY_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$9(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.COMPANY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$10(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.DEPARTMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$11(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.JOB_TITLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$12(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.PHONETIC_COMPANY_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$13(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.IMAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$14(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.THUMBNAIL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$15(SkipFormatter skipFormatter, String str) {
        return !skipFormatter.fields.contains(ContactField.NOTE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$16(SkipFormatter skipFormatter, Boolean bool) {
        return !skipFormatter.fields.contains(ContactField.IS_FAVOURITE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$17(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.EMAILS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$18(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.PHONES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$19(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.ADDRESSES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$20(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.DATES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$21(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.RELATIONS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$22(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.URL_ADDRESSES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean formatter$lambda$24$lambda$23(SkipFormatter skipFormatter, List list) {
        return !skipFormatter.fields.contains(ContactField.EXTRA_NAMES);
    }

    public final FormattedRecord<GetContactDetailsRecord> format(GetContactDetailsRecord getContactDetailsRecord) {
        Intrinsics.checkNotNullParameter(getContactDetailsRecord, "getContactDetailsRecord");
        return this.formatter.format(getContactDetailsRecord);
    }
}
