package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class IAndroidInfo implements Parcelable {
    public static final Parcelable.Creator<IAndroidInfo> CREATOR = new Parcelable.Creator<IAndroidInfo>() { // from class: org.chromium.base.IAndroidInfo.1
        @Override // android.os.Parcelable.Creator
        public IAndroidInfo createFromParcel(Parcel _aidl_source) {
            IAndroidInfo iAndroidInfo = new IAndroidInfo();
            iAndroidInfo.readFromParcel(_aidl_source);
            return iAndroidInfo;
        }

        @Override // android.os.Parcelable.Creator
        public IAndroidInfo[] newArray(int _aidl_size) {
            return new IAndroidInfo[_aidl_size];
        }
    };
    public String abiName;
    public String androidBuildFp;
    public String androidBuildId;
    public String board;
    public String brand;
    public String buildType;
    public String codename;
    public String device;
    public String hardware;
    public String manufacturer;
    public String model;
    public String securityPatch;
    public String socManufacturer;
    public String versionIncremental;
    public boolean isDebugAndroid = false;
    public int sdkInt = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.abiName);
        parcel.writeString(this.androidBuildFp);
        parcel.writeString(this.androidBuildId);
        parcel.writeString(this.board);
        parcel.writeString(this.brand);
        parcel.writeString(this.buildType);
        parcel.writeString(this.codename);
        parcel.writeString(this.device);
        parcel.writeString(this.hardware);
        parcel.writeInt(this.isDebugAndroid ? 1 : 0);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeInt(this.sdkInt);
        parcel.writeString(this.securityPatch);
        parcel.writeString(this.socManufacturer);
        parcel.writeString(this.versionIncremental);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }

    public final void readFromParcel(Parcel _aidl_parcel) {
        int dataPosition = _aidl_parcel.dataPosition();
        int readInt = _aidl_parcel.readInt();
        try {
            if (readInt < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                this.abiName = _aidl_parcel.readString();
                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                    this.androidBuildFp = _aidl_parcel.readString();
                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                        this.androidBuildId = _aidl_parcel.readString();
                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                            this.board = _aidl_parcel.readString();
                            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                this.brand = _aidl_parcel.readString();
                                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                    this.buildType = _aidl_parcel.readString();
                                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                        this.codename = _aidl_parcel.readString();
                                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                            this.device = _aidl_parcel.readString();
                                            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                this.hardware = _aidl_parcel.readString();
                                                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                    this.isDebugAndroid = _aidl_parcel.readInt() != 0;
                                                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                        this.manufacturer = _aidl_parcel.readString();
                                                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                            this.model = _aidl_parcel.readString();
                                                            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                                this.sdkInt = _aidl_parcel.readInt();
                                                                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                                    this.securityPatch = _aidl_parcel.readString();
                                                                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                                        this.socManufacturer = _aidl_parcel.readString();
                                                                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                                                            this.versionIncremental = _aidl_parcel.readString();
                                                                            if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                                                            }
                                                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                                        }
                                                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                                    }
                                                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                                }
                                                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                                            }
                                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                        }
                                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                    }
                                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            _aidl_parcel.setDataPosition(dataPosition + readInt);
        } catch (Throwable th) {
            if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            _aidl_parcel.setDataPosition(dataPosition + readInt);
            throw th;
        }
    }
}
